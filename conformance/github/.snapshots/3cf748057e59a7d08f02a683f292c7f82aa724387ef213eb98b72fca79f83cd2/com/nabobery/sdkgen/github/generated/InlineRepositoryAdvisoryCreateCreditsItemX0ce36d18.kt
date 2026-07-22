package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-create/properties/credits/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-create/properties/credits/items
 */
@Serializable(with = InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18.Serializer::class)
public class InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18(
  /**
   * The username of the user credited.
   */
  public val login: String,
  public val type: SecurityAdvisoryCreditTypes,
) {
  public class Builder {
    private var loginValue: String? = null

    public var login: String
      get() = requireNotNull(loginValue) { "login is required" }
      set(`value`) {
        loginValue = value
      }

    private var typeValue: SecurityAdvisoryCreditTypes? = null

    public var type: SecurityAdvisoryCreditTypes
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18 {
      check(loginValue != null) { "login is required" }
      check(typeValue != null) { "type is required" }
      return InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18(
        login = login,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18 must be a JSON object")
      val login = json.decodeRequired<String>(rawObject, "login")
      val type = json.decodeRequired<SecurityAdvisoryCreditTypes>(rawObject, "type")
      return InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18(
        login = login,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("login", value.login)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryAdvisoryCreateCreditsItemX0ce36d18(block: InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18.Builder.() -> Unit): InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18 = InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryAdvisoryCreateCreditsItemX0ce36d18 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
