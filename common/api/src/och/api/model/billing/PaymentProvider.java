/*
 * Copyright 2015 Evgeny Dolganov (evgenij.dolganov@gmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package och.api.model.billing;

import och.util.model.HasIntCode;

public enum PaymentProvider implements HasIntCode {
	
	SYSTEM(0),
	PAYPAL(1),
	TO_CHECKOUT(2),
	
	
	;
	
	public final int code;

	private PaymentProvider(int code) {
		this.code = code;
	}
	
	@Override
	public int getCode() {
		return code;
	}

}
