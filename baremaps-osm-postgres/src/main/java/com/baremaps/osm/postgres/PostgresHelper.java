/*
 * Copyright (C) 2020 The Baremaps Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.baremaps.osm.postgres;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public final class PostgresHelper {

  private PostgresHelper() {

  }

  public static DataSource datasource(String url) {
    BasicDataSource datasource = new BasicDataSource();
    datasource.setUrl(url);
    return datasource;
  }

  public static void executeResource(Connection connection, String resource) throws IOException, SQLException {
    String queries = Resources.toString(Resources.getResource(resource), Charsets.UTF_8);
    try (Statement statement = connection.createStatement()) {
      statement.execute(queries);
    }
  }

}
