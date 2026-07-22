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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1applications~1{client_id}~1token/post/requestBody/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1applications~1{client_id}~1token/post/requestBody/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineApplicationsTokenPostRequestJsonX9c98b7a7.Serializer::class)
public class InlineApplicationsTokenPostRequestJsonX9c98b7a7(
  /**
   * The access_token of the OAuth or GitHub application.
   */
  public val accessToken: String,
) {
  public class Builder {
    private var accessTokenValue: String? = null

    public var accessToken: String
      get() = requireNotNull(accessTokenValue) { "accessToken is required" }
      set(`value`) {
        accessTokenValue = value
      }

    public fun build(): InlineApplicationsTokenPostRequestJsonX9c98b7a7 {
      check(accessTokenValue != null) { "accessToken is required" }
      return InlineApplicationsTokenPostRequestJsonX9c98b7a7(
        accessToken = accessToken,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApplicationsTokenPostRequestJsonX9c98b7a7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineApplicationsTokenPostRequestJsonX9c98b7a7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApplicationsTokenPostRequestJsonX9c98b7a7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationsTokenPostRequestJsonX9c98b7a7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApplicationsTokenPostRequestJsonX9c98b7a7 must be a JSON object")
      val accessToken = json.decodeRequired<String>(rawObject, "access_token")
      return InlineApplicationsTokenPostRequestJsonX9c98b7a7(
        accessToken = accessToken,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApplicationsTokenPostRequestJsonX9c98b7a7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApplicationsTokenPostRequestJsonX9c98b7a7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("access_token", value.accessToken)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApplicationsTokenPostRequestJsonX9c98b7a7(block: InlineApplicationsTokenPostRequestJsonX9c98b7a7.Builder.() -> Unit): InlineApplicationsTokenPostRequestJsonX9c98b7a7 = InlineApplicationsTokenPostRequestJsonX9c98b7a7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineApplicationsTokenPostRequestJsonX9c98b7a7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
