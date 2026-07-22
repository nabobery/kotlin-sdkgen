package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/cash_balance/properties/settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/cash_balance/properties/settings
 */
@Serializable(with = InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7.Serializer::class)
public class InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7(
    public val reconciliationMode: InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a? = null,
) {
    public class Builder {
        public var reconciliationMode:
            InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a? = null

        public fun build(): InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7 =
            InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7(
                reconciliationMode = reconciliationMode,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7 must be a JSON object",
                    )
            return InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7(
                reconciliationMode =
                    rawObject["reconciliation_mode"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeX6601862a>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.reconciliationMode?.let { put("reconciliation_mode", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7(
    block: InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7.Builder.() -> Unit,
): InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7 =
    InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7.build(block)
