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

package com.baremaps.osm.pbf;

public class FileBlockSpliteratorTest {

  /*
  @Test
  public void tryAdvance() {
    Spliterator<Blob> spliterator = new SyncBlobSpliterator(new DataInputStream(dataOsmPbf()));
    spliterator.forEachRemaining(fileBlock -> assertNotNull(fileBlock));
    assertFalse(spliterator.tryAdvance(new HoldingConsumer<>()));
  }

  @Test
  public void forEachRemaining() {
    Spliterator<Blob> spliterator = new SyncBlobSpliterator(new DataInputStream(dataOsmPbf()));
    AccumulatingConsumer<Blob> accumulator = new AccumulatingConsumer<>();
    spliterator.forEachRemaining(accumulator);
    assertTrue(accumulator.values().size() == 10);
  }
  */

}
