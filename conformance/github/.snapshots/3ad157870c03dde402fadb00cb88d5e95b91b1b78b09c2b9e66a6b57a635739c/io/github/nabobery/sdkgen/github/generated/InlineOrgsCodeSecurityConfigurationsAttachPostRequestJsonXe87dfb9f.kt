package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}~1attach/post/req
 * uestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}~1attach/post/req
 * uestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f.Serializer::class)
public class InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f(
  /**
   * The type of repositories to attach the configuration to. `selected` means the configuration will be attached to
   * only the repositories specified by `selected_repository_ids`
   */
  public val scope: InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f,
  selectedRepositoryIds: List<Int>? = null,
) {
  /**
   * An array of repository IDs to attach the configuration to. You can only provide a list of repository ids when the
   * `scope` is set to `selected`.
   */
  public val selectedRepositoryIds: List<Int>? =
      selectedRepositoryIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var scopeValue: InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f?
        = null

    public var scope: InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f
      get() = requireNotNull(scopeValue) { "scope is required" }
      set(`value`) {
        scopeValue = value
      }

    private var selectedRepositoryIdsValue: List<Int>? = null

    /**
     * An array of repository IDs to attach the configuration to. You can only provide a list of repository ids when the
     * `scope` is set to `selected`.
     */
    public var selectedRepositoryIds: List<Int>?
      get() = selectedRepositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedRepositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f {
      check(scopeValue != null) { "scope is required" }
      return InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f(
        scope = scope,
        selectedRepositoryIds = selectedRepositoryIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f must be a JSON object")
      val scope = json.decodeRequired<InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonScopeX8371854f>(rawObject, "scope")
      return InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f(
        scope = scope,
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("scope", json.encodeToJsonElement(value.scope))
        value.selectedRepositoryIds?.let { put("selected_repository_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f(block: InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f.Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f = InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
