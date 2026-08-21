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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_personalization_design_preferences
 */
@Serializable(with = IssuingPersonalizationDesignPreferences.Serializer::class)
public class IssuingPersonalizationDesignPreferences(
  /**
   * Whether we use this personalization design to create cards when one isn't specified. A connected account uses the
   * Connect platform's default design if no personalization design is set as the default design.
   */
  public val isDefault: Boolean,
  /**
   * Whether this personalization design is used to create cards when one is not specified and a default for this
   * connected account does not exist.
   */
  public val isPlatformDefault: Boolean? = null,
) {
  public class Builder {
    private var isDefaultValue: Boolean? = null

    public var isDefault: Boolean
      get() = requireNotNull(isDefaultValue) { "isDefault is required" }
      set(`value`) {
        isDefaultValue = value
      }

    /**
     * Whether this personalization design is used to create cards when one is not specified and a default for this
     * connected account does not exist.
     */
    public var isPlatformDefault: Boolean? = null

    public fun build(): IssuingPersonalizationDesignPreferences {
      check(isDefaultValue != null) { "isDefault is required" }
      return IssuingPersonalizationDesignPreferences(
        isDefault = isDefault,
        isPlatformDefault = isPlatformDefault,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingPersonalizationDesignPreferences = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingPersonalizationDesignPreferences> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingPersonalizationDesignPreferences {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingPersonalizationDesignPreferences")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingPersonalizationDesignPreferences must be a JSON object")
      val isDefault = json.decodeRequired<Boolean>(rawObject, "is_default")
      return IssuingPersonalizationDesignPreferences(
        isDefault = isDefault,
        isPlatformDefault = rawObject["is_platform_default"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingPersonalizationDesignPreferences) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingPersonalizationDesignPreferences")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("is_default", json.encodeToJsonElement(value.isDefault))
        value.isPlatformDefault?.let { put("is_platform_default", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingPersonalizationDesignPreferences(block: IssuingPersonalizationDesignPreferences.Builder.() -> Unit): IssuingPersonalizationDesignPreferences = IssuingPersonalizationDesignPreferences.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingPersonalizationDesignPreferences is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
