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
 * Protected Branch Required Status Check
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/protected-branch-required-status-check
 */
@Serializable(with = ProtectedBranchRequiredStatusCheck.Serializer::class)
public class ProtectedBranchRequiredStatusCheck(
  checks: List<InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e>,
  contexts: List<String>,
  public val contextsUrl: String? = null,
  public val enforcementLevel: String? = null,
  public val strict: Boolean? = null,
  public val url: String? = null,
) {
  public val checks: List<InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e> =
      checks.toList()

  public val contexts: List<String> = contexts.toList()

  public class Builder {
    private var checksValue: List<InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e>? =
        null

    public var checks: List<InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e>
      get() = requireNotNull(checksValue) { "checks is required" }
      set(`value`) {
        checksValue = value
      }

    private var contextsValue: List<String>? = null

    public var contexts: List<String>
      get() = requireNotNull(contextsValue) { "contexts is required" }
      set(`value`) {
        contextsValue = value
      }

    public var contextsUrl: String? = null

    public var enforcementLevel: String? = null

    public var strict: Boolean? = null

    public var url: String? = null

    public fun build(): ProtectedBranchRequiredStatusCheck {
      check(checksValue != null) { "checks is required" }
      check(contextsValue != null) { "contexts is required" }
      return ProtectedBranchRequiredStatusCheck(
        checks = checks,
        contexts = contexts,
        contextsUrl = contextsUrl,
        enforcementLevel = enforcementLevel,
        strict = strict,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProtectedBranchRequiredStatusCheck = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ProtectedBranchRequiredStatusCheck> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProtectedBranchRequiredStatusCheck {
      val jsonDecoder = decoder.requireJsonDecoder("ProtectedBranchRequiredStatusCheck")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProtectedBranchRequiredStatusCheck must be a JSON object")
      val checks = json.decodeRequired<List<InlineProtectedBranchRequiredStatusCheckChecksItemX229bc06e>>(rawObject, "checks")
      val contexts = json.decodeRequired<List<String>>(rawObject, "contexts")
      return ProtectedBranchRequiredStatusCheck(
        checks = checks,
        contexts = contexts,
        contextsUrl = rawObject["contexts_url"]?.let { json.decodeFromJsonElement<String>(it) },
        enforcementLevel = rawObject["enforcement_level"]?.let { json.decodeFromJsonElement<String>(it) },
        strict = rawObject["strict"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProtectedBranchRequiredStatusCheck) {
      val jsonEncoder = encoder.requireJsonEncoder("ProtectedBranchRequiredStatusCheck")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("checks", json.encodeToJsonElement(value.checks))
        put("contexts", json.encodeToJsonElement(value.contexts))
        value.contextsUrl?.let { put("contexts_url", it) }
        value.enforcementLevel?.let { put("enforcement_level", it) }
        value.strict?.let { put("strict", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun protectedBranchRequiredStatusCheck(block: ProtectedBranchRequiredStatusCheck.Builder.() -> Unit): ProtectedBranchRequiredStatusCheck = ProtectedBranchRequiredStatusCheck.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProtectedBranchRequiredStatusCheck is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
