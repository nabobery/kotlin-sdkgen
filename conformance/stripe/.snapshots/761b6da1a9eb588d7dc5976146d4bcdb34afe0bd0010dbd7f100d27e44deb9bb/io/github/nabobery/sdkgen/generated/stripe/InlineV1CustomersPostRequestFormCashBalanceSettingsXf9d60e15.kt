package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/cash_balance/properties/settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/cash_balance/properties/settings
 */
@Serializable(with = InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15.Serializer::class)
public class InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15(
  public val reconciliationMode:
      InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeXa59f10fa? = null,
) {
  public class Builder {
    public var reconciliationMode:
        InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeXa59f10fa? = null

    public fun build(): InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15 = InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15(
      reconciliationMode = reconciliationMode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15 must be a JSON object")
      return InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15(
        reconciliationMode = rawObject["reconciliation_mode"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormCashBalanceSettingsReconciliationModeXa59f10fa>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reconciliationMode?.let { put("reconciliation_mode", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15(block: InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15.Builder.() -> Unit): InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15 = InlineV1CustomersPostRequestFormCashBalanceSettingsXf9d60e15.build(block)
