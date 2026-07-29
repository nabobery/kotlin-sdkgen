package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets~1delete/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1apps~1secrets~1delete/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema
 */
@Serializable(with = InlineV1AppsSecretsDeletePostRequestFormX830ea2e0.Serializer::class)
public class InlineV1AppsSecretsDeletePostRequestFormX830ea2e0(
  /**
   * A name for the secret that's unique within the scope.
   */
  public val name: String,
  /**
   * Specifies the scoping of the secret. Requests originating from UI extensions can only access account-scoped secrets
   * or secrets scoped to their own user.
   */
  public val scope: InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var scopeValue: InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5? = null

    public var scope: InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5
      get() = requireNotNull(scopeValue) { "scope is required" }
      set(`value`) {
        scopeValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1AppsSecretsDeletePostRequestFormX830ea2e0 {
      check(nameValue != null) { "name is required" }
      check(scopeValue != null) { "scope is required" }
      return InlineV1AppsSecretsDeletePostRequestFormX830ea2e0(
        name = name,
        scope = scope,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AppsSecretsDeletePostRequestFormX830ea2e0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AppsSecretsDeletePostRequestFormX830ea2e0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AppsSecretsDeletePostRequestFormX830ea2e0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AppsSecretsDeletePostRequestFormX830ea2e0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AppsSecretsDeletePostRequestFormX830ea2e0 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val scope = json.decodeRequired<InlineV1AppsSecretsDeletePostRequestFormScopeX7f8febf5>(rawObject, "scope")
      return InlineV1AppsSecretsDeletePostRequestFormX830ea2e0(
        name = name,
        scope = scope,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AppsSecretsDeletePostRequestFormX830ea2e0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AppsSecretsDeletePostRequestFormX830ea2e0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("scope", json.encodeToJsonElement(value.scope))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AppsSecretsDeletePostRequestFormX830ea2e0(block: InlineV1AppsSecretsDeletePostRequestFormX830ea2e0.Builder.() -> Unit): InlineV1AppsSecretsDeletePostRequestFormX830ea2e0 = InlineV1AppsSecretsDeletePostRequestFormX830ea2e0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AppsSecretsDeletePostRequestFormX830ea2e0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
