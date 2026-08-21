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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/card_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762(
  public val declineOn:
      InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4? = null,
  public val statementDescriptorPrefix: String? = null,
  public val statementDescriptorPrefixKana:
      InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364? = null,
  public val statementDescriptorPrefixKanji:
      InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2? = null,
) {
  public class Builder {
    public var declineOn: InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4? =
        null

    public var statementDescriptorPrefix: String? = null

    public var statementDescriptorPrefixKana:
        InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364? = null

    public var statementDescriptorPrefixKanji:
        InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762 = InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762(
      declineOn = declineOn,
      statementDescriptorPrefix = statementDescriptorPrefix,
      statementDescriptorPrefixKana = statementDescriptorPrefixKana,
      statementDescriptorPrefixKanji = statementDescriptorPrefixKanji,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762 must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762(
        declineOn = rawObject["decline_on"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsCardPaymentsDeclineOnX2a15c6d4>(it) },
        statementDescriptorPrefix = rawObject["statement_descriptor_prefix"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptorPrefixKana = rawObject["statement_descriptor_prefix_kana"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP82b2Xfb1b6364>(it) },
        statementDescriptorPrefixKanji = rawObject["statement_descriptor_prefix_kanji"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsStatementDescriptorP143dXce21b6d2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762")
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

public fun inlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762(block: InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762 = InlineV1AccountsPostRequestFormSettingsCardPaymentsXac2b6762.build(block)
