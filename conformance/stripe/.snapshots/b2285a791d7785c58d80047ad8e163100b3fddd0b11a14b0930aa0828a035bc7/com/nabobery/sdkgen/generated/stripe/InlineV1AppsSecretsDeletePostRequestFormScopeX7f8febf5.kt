package com.nabobery.sdkgen.generated.stripe

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
 * Specifies the scoping of the secret. Requests originating from UI extensions can only access account-scoped secrets
 * or secrets scoped to their own user.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets~1delete/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/scope
 */
@Serializable(with = InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5.Serializer::class)
public class InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5(
  public val type: InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45,
  public val user: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45? = null

    public var type: InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var user: String? = null

    public fun build(): InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5 {
      check(typeValue != null) { "type is required" }
      return InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5(
        type = type,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5 must be a JSON object")
      val type = json.decodeRequired<InlineV1AppsSecretsDeletePostRequestFormScopeTypeX35b92a45>(rawObject, "type")
      return InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5(
        type = type,
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5(block: InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5.Builder.() -> Unit): InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5 = InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
