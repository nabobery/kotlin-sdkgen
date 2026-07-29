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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b.Serializer::class)
public class InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b(
  public val statementDescriptor: String? = null,
  public val statementDescriptorKana: String? = null,
  public val statementDescriptorKanji: String? = null,
) {
  public class Builder {
    public var statementDescriptor: String? = null

    public var statementDescriptorKana: String? = null

    public var statementDescriptorKanji: String? = null

    public fun build(): InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b = InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b(
      statementDescriptor = statementDescriptor,
      statementDescriptorKana = statementDescriptorKana,
      statementDescriptorKanji = statementDescriptorKanji,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b must be a JSON object")
      return InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b(
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptorKana = rawObject["statement_descriptor_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptorKanji = rawObject["statement_descriptor_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.statementDescriptorKana?.let { put("statement_descriptor_kana", it) }
        value.statementDescriptorKanji?.let { put("statement_descriptor_kanji", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b(block: InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b.Builder.() -> Unit): InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b = InlineV1AccountsPostRequestFormSettingsPaymentsXdc23302b.build(block)
