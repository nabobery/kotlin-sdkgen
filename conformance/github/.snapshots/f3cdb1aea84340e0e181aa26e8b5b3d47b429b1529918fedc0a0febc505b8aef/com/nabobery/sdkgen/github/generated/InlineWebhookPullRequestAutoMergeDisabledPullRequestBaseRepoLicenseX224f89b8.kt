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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/base/properties/repo/properties/license.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/base/properties/repo/properties/license
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8.Serializer::class)
public class InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8(
  public val key: String,
  public val name: String,
  public val nodeId: String,
  public val spdxId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String?,
) {
  public class Builder {
    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var spdxIdValue: String? = null

    public var spdxId: String
      get() = requireNotNull(spdxIdValue) { "spdxId is required" }
      set(`value`) {
        spdxIdValue = value
      }

    private var urlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var url: String?
      get() = urlState.valueOrNull()
      set(`value`) {
        urlState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8 {
      check(keyValue != null) { "key is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(spdxIdValue != null) { "spdxId is required" }
      check(urlState !== FieldState.Absent) { "url is required, even when null" }
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8(
        key = key,
        name = name,
        nodeId = nodeId,
        spdxId = spdxId,
        url = urlState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8 must be a JSON object")
      val key = json.decodeRequired<String>(rawObject, "key")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val spdxId = json.decodeRequired<String>(rawObject, "spdx_id")
      if (!rawObject.containsKey("url")) {
        throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8 is missing required property 'url'")
      }
      val url = rawObject["url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8(
        key = key,
        name = name,
        nodeId = nodeId,
        spdxId = spdxId,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("key", value.key)
        put("name", value.name)
        put("node_id", value.nodeId)
        put("spdx_id", value.spdxId)
        put("url", value.url?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8(block: InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8.Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8 = InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestBaseRepoLicenseX224f89b8 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
