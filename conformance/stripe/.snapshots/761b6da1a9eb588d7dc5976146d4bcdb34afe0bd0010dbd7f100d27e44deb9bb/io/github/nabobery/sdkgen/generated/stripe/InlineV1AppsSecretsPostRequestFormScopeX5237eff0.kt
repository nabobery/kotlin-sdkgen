package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/scope
 */
@Serializable(with = InlineV1AppsSecretsPostRequestFormScopeX5237eff0.Serializer::class)
public class InlineV1AppsSecretsPostRequestFormScopeX5237eff0(
  public val type: InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb,
  public val user: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb? = null

    public var type: InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var user: String? = null

    public fun build(): InlineV1AppsSecretsPostRequestFormScopeX5237eff0 {
      check(typeValue != null) { "type is required" }
      return InlineV1AppsSecretsPostRequestFormScopeX5237eff0(
        type = type,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AppsSecretsPostRequestFormScopeX5237eff0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AppsSecretsPostRequestFormScopeX5237eff0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AppsSecretsPostRequestFormScopeX5237eff0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AppsSecretsPostRequestFormScopeX5237eff0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AppsSecretsPostRequestFormScopeX5237eff0 must be a JSON object")
      val type = json.decodeRequired<InlineV1AppsSecretsPostRequestFormScopeTypeX784d7beb>(rawObject, "type")
      return InlineV1AppsSecretsPostRequestFormScopeX5237eff0(
        type = type,
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AppsSecretsPostRequestFormScopeX5237eff0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AppsSecretsPostRequestFormScopeX5237eff0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AppsSecretsPostRequestFormScopeX5237eff0(block: InlineV1AppsSecretsPostRequestFormScopeX5237eff0.Builder.() -> Unit): InlineV1AppsSecretsPostRequestFormScopeX5237eff0 = InlineV1AppsSecretsPostRequestFormScopeX5237eff0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AppsSecretsPostRequestFormScopeX5237eff0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
