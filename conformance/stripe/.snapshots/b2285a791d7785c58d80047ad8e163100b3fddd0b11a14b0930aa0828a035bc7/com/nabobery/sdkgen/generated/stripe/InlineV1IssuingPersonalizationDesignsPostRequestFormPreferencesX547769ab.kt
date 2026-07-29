package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Information on whether this personalization design is used to create cards when one is not specified.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/preferences
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab.Serializer::class)
public class InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab(
  public val isDefault: Boolean,
) {
  public class Builder {
    private var isDefaultValue: Boolean? = null

    public var isDefault: Boolean
      get() = requireNotNull(isDefaultValue) { "isDefault is required" }
      set(`value`) {
        isDefaultValue = value
      }

    public fun build(): InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab {
      check(isDefaultValue != null) { "isDefault is required" }
      return InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab(
        isDefault = isDefault,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab must be a JSON object")
      val isDefault = json.decodeRequired<Boolean>(rawObject, "is_default")
      return InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab(
        isDefault = isDefault,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("is_default", json.encodeToJsonElement(value.isDefault))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab(block: InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab.Builder.() -> Unit): InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab = InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IssuingPersonalizationDesignsPostRequestFormPreferencesX547769ab is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
