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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/card_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c(
  public val declineOn:
      InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d? = null,
  public val statementDescriptorPrefix: String? = null,
  public val statementDescriptorPrefixKana:
      InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489? = null,
  public val statementDescriptorPrefixKanji:
      InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b? = null,
) {
  public class Builder {
    public var declineOn: InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d? =
        null

    public var statementDescriptorPrefix: String? = null

    public var statementDescriptorPrefixKana:
        InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489? = null

    public var statementDescriptorPrefixKanji:
        InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c = InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c(
      declineOn = declineOn,
      statementDescriptorPrefix = statementDescriptorPrefix,
      statementDescriptorPrefixKana = statementDescriptorPrefixKana,
      statementDescriptorPrefixKanji = statementDescriptorPrefixKanji,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c(
        declineOn = rawObject["decline_on"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX1632b32d>(it) },
        statementDescriptorPrefix = rawObject["statement_descriptor_prefix"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptorPrefixKana = rawObject["statement_descriptor_prefix_kana"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfc390489>(it) },
        statementDescriptorPrefixKanji = rawObject["statement_descriptor_prefix_kanji"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dX8338258b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.declineOn?.let { put("decline_on", json.encodeToJsonElement(it)) }
        value.statementDescriptorPrefix?.let { put("statement_descriptor_prefix", it) }
        value.statementDescriptorPrefixKana?.let { put("statement_descriptor_prefix_kana", json.encodeToJsonElement(it)) }
        value.statementDescriptorPrefixKanji?.let { put("statement_descriptor_prefix_kanji", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c(block: InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c = InlineV1AccountsPostRequestFormSettingsCardPaymentsXf2522e0c.build(block)
