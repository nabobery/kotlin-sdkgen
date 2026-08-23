package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1autolinks/post/requestBody/content/application~1json/sc
 * hema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1autolinks/post/requestBody/content/application~1json/sc
 * hema
 */
@Serializable(with = InlineReposAutolinksPostRequestJsonXd4aefcfd.Serializer::class)
public class InlineReposAutolinksPostRequestJsonXd4aefcfd(
  /**
   * This prefix appended by certain characters will generate a link any time it is found in an issue, pull request, or
   * commit.
   */
  public val keyPrefix: String,
  /**
   * The URL must contain `<num>` for the reference number. `<num>` matches different characters depending on the value
   * of `is_alphanumeric`.
   */
  public val urlTemplate: String,
  /**
   * Whether this autolink reference matches alphanumeric characters. If true, the `<num>` parameter of the
   * `url_template` matches alphanumeric characters `A-Z` (case insensitive), `0-9`, and `-`. If false, this autolink
   * reference only matches numeric characters.
   */
  public val isAlphanumeric: Boolean? = null,
) {
  public class Builder {
    private var keyPrefixValue: String? = null

    public var keyPrefix: String
      get() = requireNotNull(keyPrefixValue) { "keyPrefix is required" }
      set(`value`) {
        keyPrefixValue = value
      }

    private var urlTemplateValue: String? = null

    public var urlTemplate: String
      get() = requireNotNull(urlTemplateValue) { "urlTemplate is required" }
      set(`value`) {
        urlTemplateValue = value
      }

    /**
     * Whether this autolink reference matches alphanumeric characters. If true, the `<num>` parameter of the
     * `url_template` matches alphanumeric characters `A-Z` (case insensitive), `0-9`, and `-`. If false, this autolink
     * reference only matches numeric characters.
     */
    public var isAlphanumeric: Boolean? = null

    public fun build(): InlineReposAutolinksPostRequestJsonXd4aefcfd {
      check(keyPrefixValue != null) { "keyPrefix is required" }
      check(urlTemplateValue != null) { "urlTemplate is required" }
      return InlineReposAutolinksPostRequestJsonXd4aefcfd(
        keyPrefix = keyPrefix,
        urlTemplate = urlTemplate,
        isAlphanumeric = isAlphanumeric,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposAutolinksPostRequestJsonXd4aefcfd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposAutolinksPostRequestJsonXd4aefcfd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposAutolinksPostRequestJsonXd4aefcfd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposAutolinksPostRequestJsonXd4aefcfd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposAutolinksPostRequestJsonXd4aefcfd must be a JSON object")
      val keyPrefix = json.decodeRequired<String>(rawObject, "key_prefix")
      val urlTemplate = json.decodeRequired<String>(rawObject, "url_template")
      return InlineReposAutolinksPostRequestJsonXd4aefcfd(
        keyPrefix = keyPrefix,
        urlTemplate = urlTemplate,
        isAlphanumeric = rawObject["is_alphanumeric"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposAutolinksPostRequestJsonXd4aefcfd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposAutolinksPostRequestJsonXd4aefcfd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key_prefix", value.keyPrefix)
        put("url_template", value.urlTemplate)
        value.isAlphanumeric?.let { put("is_alphanumeric", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposAutolinksPostRequestJsonXd4aefcfd(block: InlineReposAutolinksPostRequestJsonXd4aefcfd.Builder.() -> Unit): InlineReposAutolinksPostRequestJsonXd4aefcfd = InlineReposAutolinksPostRequestJsonXd4aefcfd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposAutolinksPostRequestJsonXd4aefcfd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
