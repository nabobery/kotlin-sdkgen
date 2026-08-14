package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1keys/post/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1keys/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposKeysPostRequestJsonX06eb4806.Serializer::class)
public class InlineReposKeysPostRequestJsonX06eb4806(
  /**
   * The contents of the key.
   */
  public val key: String,
  /**
   * If `true`, the key will only be able to read repository contents. Otherwise, the key will be able to read and
   * write.
   *
   * Deploy keys with write access can perform the same actions as an organization member with admin access, or a
   * collaborator on a personal repository. For more information, see "[Repository permission levels for an
   * organization](https://docs.github.com/articles/repository-permission-levels-for-an-organization/)" and "[Permission
   * levels for a user account
   * repository](https://docs.github.com/articles/permission-levels-for-a-user-account-repository/)."
   */
  public val readOnly: Boolean? = null,
  /**
   * A name for the key.
   */
  public val title: String? = null,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    /**
     * If `true`, the key will only be able to read repository contents. Otherwise, the key will be able to read and
     * write.
     *
     * Deploy keys with write access can perform the same actions as an organization member with admin access, or a
     * collaborator on a personal repository. For more information, see "[Repository permission levels for an
     * organization](https://docs.github.com/articles/repository-permission-levels-for-an-organization/)" and
     * "[Permission levels for a user account
     * repository](https://docs.github.com/articles/permission-levels-for-a-user-account-repository/)."
     */
    public var readOnly: Boolean? = null

    /**
     * A name for the key.
     */
    public var title: String? = null

    public fun build(): InlineReposKeysPostRequestJsonX06eb4806 {
      check(keyValue != null) { "key is required" }
      return InlineReposKeysPostRequestJsonX06eb4806(
        key = key,
        readOnly = readOnly,
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposKeysPostRequestJsonX06eb4806 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposKeysPostRequestJsonX06eb4806> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposKeysPostRequestJsonX06eb4806 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposKeysPostRequestJsonX06eb4806")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposKeysPostRequestJsonX06eb4806 must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      return InlineReposKeysPostRequestJsonX06eb4806(
        key = key,
        readOnly = rawObject["read_only"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposKeysPostRequestJsonX06eb4806) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposKeysPostRequestJsonX06eb4806")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        value.readOnly?.let { put("read_only", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposKeysPostRequestJsonX06eb4806(block: InlineReposKeysPostRequestJsonX06eb4806.Builder.() -> Unit): InlineReposKeysPostRequestJsonX06eb4806 = InlineReposKeysPostRequestJsonX06eb4806.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposKeysPostRequestJsonX06eb4806 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
