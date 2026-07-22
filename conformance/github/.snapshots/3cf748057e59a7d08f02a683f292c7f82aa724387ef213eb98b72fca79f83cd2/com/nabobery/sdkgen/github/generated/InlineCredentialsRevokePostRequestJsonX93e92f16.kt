package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1credentials~1revoke/post/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1credentials~1revoke/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineCredentialsRevokePostRequestJsonX93e92f16.Serializer::class)
public class InlineCredentialsRevokePostRequestJsonX93e92f16(
  credentials: List<String>,
) {
  /**
   * A list of credentials to be revoked, up to 1000 per request.
   */
  public val credentials: List<String> = credentials.toList()

  public class Builder {
    private var credentialsValue: List<String>? = null

    public var credentials: List<String>
      get() = requireNotNull(credentialsValue) { "credentials is required" }
      set(`value`) {
        credentialsValue = value
      }

    public fun build(): InlineCredentialsRevokePostRequestJsonX93e92f16 {
      check(credentialsValue != null) { "credentials is required" }
      return InlineCredentialsRevokePostRequestJsonX93e92f16(
        credentials = credentials,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCredentialsRevokePostRequestJsonX93e92f16 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCredentialsRevokePostRequestJsonX93e92f16> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCredentialsRevokePostRequestJsonX93e92f16 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCredentialsRevokePostRequestJsonX93e92f16")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCredentialsRevokePostRequestJsonX93e92f16 must be a JSON object")
      val credentials = json.decodeRequired<List<String>>(rawObject, "credentials")
      return InlineCredentialsRevokePostRequestJsonX93e92f16(
        credentials = credentials,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCredentialsRevokePostRequestJsonX93e92f16) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCredentialsRevokePostRequestJsonX93e92f16")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("credentials", json.encodeToJsonElement(value.credentials))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCredentialsRevokePostRequestJsonX93e92f16(block: InlineCredentialsRevokePostRequestJsonX93e92f16.Builder.() -> Unit): InlineCredentialsRevokePostRequestJsonX93e92f16 = InlineCredentialsRevokePostRequestJsonX93e92f16.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCredentialsRevokePostRequestJsonX93e92f16 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
