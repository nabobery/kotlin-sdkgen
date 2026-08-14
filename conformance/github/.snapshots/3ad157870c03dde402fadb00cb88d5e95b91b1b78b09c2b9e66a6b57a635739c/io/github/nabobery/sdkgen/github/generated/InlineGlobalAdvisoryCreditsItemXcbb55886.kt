package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/global-advisory/properties/credits/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/global-advisory/properties/credits/items
 */
@Serializable(with = InlineGlobalAdvisoryCreditsItemXcbb55886.Serializer::class)
public class InlineGlobalAdvisoryCreditsItemXcbb55886(
  public val type: SecurityAdvisoryCreditTypes,
  public val user: SimpleUser,
) {
  public class Builder {
    private var typeValue: SecurityAdvisoryCreditTypes? = null

    public var type: SecurityAdvisoryCreditTypes
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var userValue: SimpleUser? = null

    public var user: SimpleUser
      get() = requireNotNull(userValue) { "user is required" }
      set(`value`) {
        userValue = value
      }

    public fun build(): InlineGlobalAdvisoryCreditsItemXcbb55886 {
      check(typeValue != null) { "type is required" }
      check(userValue != null) { "user is required" }
      return InlineGlobalAdvisoryCreditsItemXcbb55886(
        type = type,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGlobalAdvisoryCreditsItemXcbb55886 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGlobalAdvisoryCreditsItemXcbb55886> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGlobalAdvisoryCreditsItemXcbb55886 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGlobalAdvisoryCreditsItemXcbb55886")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGlobalAdvisoryCreditsItemXcbb55886 must be a JSON object")
      val type = json.decodeRequired<SecurityAdvisoryCreditTypes>(rawObject, "type")
      val user = json.decodeRequired<SimpleUser>(rawObject, "user")
      return InlineGlobalAdvisoryCreditsItemXcbb55886(
        type = type,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGlobalAdvisoryCreditsItemXcbb55886) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGlobalAdvisoryCreditsItemXcbb55886")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("user", json.encodeToJsonElement(value.user))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGlobalAdvisoryCreditsItemXcbb55886(block: InlineGlobalAdvisoryCreditsItemXcbb55886.Builder.() -> Unit): InlineGlobalAdvisoryCreditsItemXcbb55886 = InlineGlobalAdvisoryCreditsItemXcbb55886.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGlobalAdvisoryCreditsItemXcbb55886 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
