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
 * Balance information and default balance settings for this customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/cash_balance
 */
@Serializable(with = InlineV1CustomersPostRequestFormCashBalanceX43728c16.Serializer::class)
public class InlineV1CustomersPostRequestFormCashBalanceX43728c16(
  public val settings: InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7? = null,
) {
  public class Builder {
    public var settings: InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7? = null

    public fun build(): InlineV1CustomersPostRequestFormCashBalanceX43728c16 = InlineV1CustomersPostRequestFormCashBalanceX43728c16(
      settings = settings,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersPostRequestFormCashBalanceX43728c16 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormCashBalanceX43728c16> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormCashBalanceX43728c16 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormCashBalanceX43728c16")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersPostRequestFormCashBalanceX43728c16 must be a JSON object")
      return InlineV1CustomersPostRequestFormCashBalanceX43728c16(
        settings = rawObject["settings"]?.let { json.decodeFromJsonElement<InlineV1CustomersPostRequestFormCashBalanceSettingsX07d5bcd7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormCashBalanceX43728c16) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormCashBalanceX43728c16")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.settings?.let { put("settings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersPostRequestFormCashBalanceX43728c16(block: InlineV1CustomersPostRequestFormCashBalanceX43728c16.Builder.() -> Unit): InlineV1CustomersPostRequestFormCashBalanceX43728c16 = InlineV1CustomersPostRequestFormCashBalanceX43728c16.build(block)
