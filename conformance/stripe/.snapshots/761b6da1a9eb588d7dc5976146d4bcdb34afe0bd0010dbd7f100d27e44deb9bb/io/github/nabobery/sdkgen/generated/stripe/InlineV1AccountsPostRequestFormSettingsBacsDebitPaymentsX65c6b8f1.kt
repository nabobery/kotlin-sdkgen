package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/bacs_debit_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/bacs_debit_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1(
  public val displayName: String? = null,
) {
  public class Builder {
    public var displayName: String? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1 = InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1(
      displayName = displayName,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1 must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1(
        displayName = rawObject["display_name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayName?.let { put("display_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1(block: InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1 = InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsX65c6b8f1.build(block)
