package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Status Check Policy
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/status-check-policy
 */
@Serializable(with = StatusCheckPolicy.Serializer::class)
public class StatusCheckPolicy(
  checks: List<InlineStatusCheckPolicyChecksItemX94eb01eb>,
  contexts: List<String>,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val contextsUrl: String,
  public val strict: Boolean,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public val checks: List<InlineStatusCheckPolicyChecksItemX94eb01eb> = checks.toList()

  public val contexts: List<String> = contexts.toList()

  public class Builder {
    private var checksValue: List<InlineStatusCheckPolicyChecksItemX94eb01eb>? = null

    public var checks: List<InlineStatusCheckPolicyChecksItemX94eb01eb>
      get() = requireNotNull(checksValue) { "checks is required" }.toList()
      set(`value`) {
        checksValue = value.toList()
      }

    private var contextsValue: List<String>? = null

    public var contexts: List<String>
      get() = requireNotNull(contextsValue) { "contexts is required" }.toList()
      set(`value`) {
        contextsValue = value.toList()
      }

    private var contextsUrlValue: String? = null

    public var contextsUrl: String
      get() = requireNotNull(contextsUrlValue) { "contextsUrl is required" }
      set(`value`) {
        contextsUrlValue = value
      }

    private var strictValue: Boolean? = null

    public var strict: Boolean
      get() = requireNotNull(strictValue) { "strict is required" }
      set(`value`) {
        strictValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): StatusCheckPolicy {
      check(checksValue != null) { "checks is required" }
      check(contextsValue != null) { "contexts is required" }
      check(contextsUrlValue != null) { "contextsUrl is required" }
      check(strictValue != null) { "strict is required" }
      check(urlValue != null) { "url is required" }
      return StatusCheckPolicy(
        checks = checks,
        contexts = contexts,
        contextsUrl = contextsUrl,
        strict = strict,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): StatusCheckPolicy = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<StatusCheckPolicy> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): StatusCheckPolicy {
      val jsonDecoder = decoder.requireJsonDecoder("StatusCheckPolicy")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("StatusCheckPolicy must be a JSON object")
      val checks = json.decodeRequired<List<InlineStatusCheckPolicyChecksItemX94eb01eb>>(rawObject, "checks")
      val contexts = json.decodeRequired<List<String>>(rawObject, "contexts")
      val contextsUrl = json.decodeRequired<String>(rawObject, "contexts_url")
      val strict = json.decodeRequired<Boolean>(rawObject, "strict")
      val url = json.decodeRequired<String>(rawObject, "url")
      return StatusCheckPolicy(
        checks = checks,
        contexts = contexts,
        contextsUrl = contextsUrl,
        strict = strict,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: StatusCheckPolicy) {
      val jsonEncoder = encoder.requireJsonEncoder("StatusCheckPolicy")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("checks", json.encodeToJsonElement(value.checks))
        put("contexts", json.encodeToJsonElement(value.contexts))
        put("contexts_url", value.contextsUrl)
        put("strict", json.encodeToJsonElement(value.strict))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun statusCheckPolicy(block: StatusCheckPolicy.Builder.() -> Unit): StatusCheckPolicy = StatusCheckPolicy.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("StatusCheckPolicy is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
