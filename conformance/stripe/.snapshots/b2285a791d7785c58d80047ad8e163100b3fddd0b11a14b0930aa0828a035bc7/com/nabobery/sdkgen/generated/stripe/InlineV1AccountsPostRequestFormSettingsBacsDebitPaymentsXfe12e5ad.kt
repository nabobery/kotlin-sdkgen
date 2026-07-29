package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/bacs_debit_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/bacs_debit_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad(
  public val displayName: String? = null,
) {
  public class Builder {
    public var displayName: String? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad = InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad(
      displayName = displayName,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad(
        displayName = rawObject["display_name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.displayName?.let { put("display_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad(block: InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad = InlineV1AccountsPostRequestFormSettingsBacsDebitPaymentsXfe12e5ad.build(block)
