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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1applications~1{client_id}~1token/delete/requestBody/content/application~1json/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1applications~1{client_id}~1token/delete/requestBody/content/application~1json/s
 * chema
 */
@Serializable(with = InlineApplicationsTokenDeleteRequestJsonXc90fd95f.Serializer::class)
public class InlineApplicationsTokenDeleteRequestJsonXc90fd95f(
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

    public fun build(): InlineApplicationsTokenDeleteRequestJsonXc90fd95f {
      check(accessTokenValue != null) { "accessToken is required" }
      return InlineApplicationsTokenDeleteRequestJsonXc90fd95f(
        accessToken = accessToken,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApplicationsTokenDeleteRequestJsonXc90fd95f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineApplicationsTokenDeleteRequestJsonXc90fd95f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApplicationsTokenDeleteRequestJsonXc90fd95f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationsTokenDeleteRequestJsonXc90fd95f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApplicationsTokenDeleteRequestJsonXc90fd95f must be a JSON object")
      val accessToken = json.decodeRequired<String>(rawObject, "access_token")
      return InlineApplicationsTokenDeleteRequestJsonXc90fd95f(
        accessToken = accessToken,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApplicationsTokenDeleteRequestJsonXc90fd95f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApplicationsTokenDeleteRequestJsonXc90fd95f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("access_token", value.accessToken)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApplicationsTokenDeleteRequestJsonXc90fd95f(block: InlineApplicationsTokenDeleteRequestJsonXc90fd95f.Builder.() -> Unit): InlineApplicationsTokenDeleteRequestJsonXc90fd95f = InlineApplicationsTokenDeleteRequestJsonXc90fd95f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineApplicationsTokenDeleteRequestJsonXc90fd95f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
