package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-diff/items/properties/vulnerabilities/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependency-graph-diff/items/properties/vulnerabilities/items
 */
@Serializable(with = InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b.Serializer::class)
public class InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b(
  public val advisoryGhsaId: String,
  public val advisorySummary: String,
  public val advisoryUrl: String,
  public val severity: String,
) {
  public class Builder {
    private var advisoryGhsaIdValue: String? = null

    public var advisoryGhsaId: String
      get() = requireNotNull(advisoryGhsaIdValue) { "advisoryGhsaId is required" }
      set(`value`) {
        advisoryGhsaIdValue = value
      }

    private var advisorySummaryValue: String? = null

    public var advisorySummary: String
      get() = requireNotNull(advisorySummaryValue) { "advisorySummary is required" }
      set(`value`) {
        advisorySummaryValue = value
      }

    private var advisoryUrlValue: String? = null

    public var advisoryUrl: String
      get() = requireNotNull(advisoryUrlValue) { "advisoryUrl is required" }
      set(`value`) {
        advisoryUrlValue = value
      }

    private var severityValue: String? = null

    public var severity: String
      get() = requireNotNull(severityValue) { "severity is required" }
      set(`value`) {
        severityValue = value
      }

    public fun build(): InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b {
      check(advisoryGhsaIdValue != null) { "advisoryGhsaId is required" }
      check(advisorySummaryValue != null) { "advisorySummary is required" }
      check(advisoryUrlValue != null) { "advisoryUrl is required" }
      check(severityValue != null) { "severity is required" }
      return InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b(
        advisoryGhsaId = advisoryGhsaId,
        advisorySummary = advisorySummary,
        advisoryUrl = advisoryUrl,
        severity = severity,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b must be a JSON object")
      val advisoryGhsaId = json.decodeRequired<String>(rawObject, "advisory_ghsa_id")
      val advisorySummary = json.decodeRequired<String>(rawObject, "advisory_summary")
      val advisoryUrl = json.decodeRequired<String>(rawObject, "advisory_url")
      val severity = json.decodeRequired<String>(rawObject, "severity")
      return InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b(
        advisoryGhsaId = advisoryGhsaId,
        advisorySummary = advisorySummary,
        advisoryUrl = advisoryUrl,
        severity = severity,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("advisory_ghsa_id", value.advisoryGhsaId)
        put("advisory_summary", value.advisorySummary)
        put("advisory_url", value.advisoryUrl)
        put("severity", value.severity)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b(block: InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b.Builder.() -> Unit): InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b = InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineDependencyGraphDiffItemVulnerabilitiesItemX1ea60e4b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
