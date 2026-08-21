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
 * sdkgen://source/openapi.yaml#/paths/~1applications~1{client_id}~1grant/delete/requestBody/content/application~1json/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1applications~1{client_id}~1grant/delete/requestBody/content/application~1json/s
 * chema
 */
@Serializable(with = InlineApplicationsGrantDeleteRequestJsonX60601b0d.Serializer::class)
public class InlineApplicationsGrantDeleteRequestJsonX60601b0d(
  /**
   * The OAuth access token used to authenticate to the GitHub API.
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

    public fun build(): InlineApplicationsGrantDeleteRequestJsonX60601b0d {
      check(accessTokenValue != null) { "accessToken is required" }
      return InlineApplicationsGrantDeleteRequestJsonX60601b0d(
        accessToken = accessToken,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApplicationsGrantDeleteRequestJsonX60601b0d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineApplicationsGrantDeleteRequestJsonX60601b0d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApplicationsGrantDeleteRequestJsonX60601b0d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationsGrantDeleteRequestJsonX60601b0d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApplicationsGrantDeleteRequestJsonX60601b0d must be a JSON object")
      val accessToken = json.decodeRequired<String>(rawObject, "access_token")
      return InlineApplicationsGrantDeleteRequestJsonX60601b0d(
        accessToken = accessToken,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApplicationsGrantDeleteRequestJsonX60601b0d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApplicationsGrantDeleteRequestJsonX60601b0d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("access_token", value.accessToken)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApplicationsGrantDeleteRequestJsonX60601b0d(block: InlineApplicationsGrantDeleteRequestJsonX60601b0d.Builder.() -> Unit): InlineApplicationsGrantDeleteRequestJsonX60601b0d = InlineApplicationsGrantDeleteRequestJsonX60601b0d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineApplicationsGrantDeleteRequestJsonX60601b0d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
