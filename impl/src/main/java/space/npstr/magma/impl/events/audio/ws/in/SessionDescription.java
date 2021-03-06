/*
 * Copyright 2018 Dennis Neufeld
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package space.npstr.magma.impl.events.audio.ws.in;

import org.immutables.value.Value;
import space.npstr.magma.impl.EncryptionMode;
import space.npstr.magma.impl.events.audio.ws.OpCode;
import space.npstr.magma.impl.immutables.ImmutableWsEvent;

/**
 * Created by napster on 20.04.18.
 */
@Value.Immutable
@ImmutableWsEvent
public abstract class SessionDescription implements InboundWsEvent {

    @Override
    public int getOpCode() {
        return OpCode.SESSION_DESCRIPTION;
    }

    /**
     * @return the encryption mode of this session
     */
    public abstract EncryptionMode getEncryptionMode();

    /**
     * @return the secret key sent to us by the Session Description voice websocket event (op 4)
     */
    public abstract byte[] getSecretKey();
}
