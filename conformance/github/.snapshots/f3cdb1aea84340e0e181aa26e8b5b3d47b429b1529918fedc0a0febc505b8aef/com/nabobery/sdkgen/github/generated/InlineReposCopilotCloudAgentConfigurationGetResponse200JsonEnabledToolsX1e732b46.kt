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
 * The enabled review tools for Copilot cloud agent.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1copilot~1cloud-agent~1configuration/get/responses/200/c
 * ontent/application~1json/schema/properties/enabled_tools
 */
@Serializable(with = InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46.Serializer::class)
public class InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46(
  /**
   * Whether the CodeQL tool is enabled for the Copilot cloud agent.
   */
  public val codeql: Boolean,
  /**
   * Whether the Copilot code review tool is enabled for the Copilot cloud agent.
   */
  public val copilotCodeReview: Boolean,
  /**
   * Whether the dependency vulnerability checks tool is enabled for the Copilot cloud agent.
   */
  public val dependencyVulnerabilityChecks: Boolean,
  /**
   * Whether the secret scanning tool is enabled for the Copilot cloud agent.
   */
  public val secretScanning: Boolean,
) {
  public class Builder {
    private var codeqlValue: Boolean? = null

    public var codeql: Boolean
      get() = requireNotNull(codeqlValue) { "codeql is required" }
      set(`value`) {
        codeqlValue = value
      }

    private var copilotCodeReviewValue: Boolean? = null

    public var copilotCodeReview: Boolean
      get() = requireNotNull(copilotCodeReviewValue) { "copilotCodeReview is required" }
      set(`value`) {
        copilotCodeReviewValue = value
      }

    private var dependencyVulnerabilityChecksValue: Boolean? = null

    public var dependencyVulnerabilityChecks: Boolean
      get() = requireNotNull(dependencyVulnerabilityChecksValue) { "dependencyVulnerabilityChecks is required" }
      set(`value`) {
        dependencyVulnerabilityChecksValue = value
      }

    private var secretScanningValue: Boolean? = null

    public var secretScanning: Boolean
      get() = requireNotNull(secretScanningValue) { "secretScanning is required" }
      set(`value`) {
        secretScanningValue = value
      }

    public fun build(): InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46 {
      check(codeqlValue != null) { "codeql is required" }
      check(copilotCodeReviewValue != null) { "copilotCodeReview is required" }
      check(dependencyVulnerabilityChecksValue != null) { "dependencyVulnerabilityChecks is required" }
      check(secretScanningValue != null) { "secretScanning is required" }
      return InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46(
        codeql = codeql,
        copilotCodeReview = copilotCodeReview,
        dependencyVulnerabilityChecks = dependencyVulnerabilityChecks,
        secretScanning = secretScanning,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46 must be a JSON object")
      val codeql = json.decodeRequired<Boolean>(rawObject, "codeql")
      val copilotCodeReview = json.decodeRequired<Boolean>(rawObject, "copilot_code_review")
      val dependencyVulnerabilityChecks = json.decodeRequired<Boolean>(rawObject, "dependency_vulnerability_checks")
      val secretScanning = json.decodeRequired<Boolean>(rawObject, "secret_scanning")
      return InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46(
        codeql = codeql,
        copilotCodeReview = copilotCodeReview,
        dependencyVulnerabilityChecks = dependencyVulnerabilityChecks,
        secretScanning = secretScanning,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("codeql", json.encodeToJsonElement(value.codeql))
        put("copilot_code_review", json.encodeToJsonElement(value.copilotCodeReview))
        put("dependency_vulnerability_checks", json.encodeToJsonElement(value.dependencyVulnerabilityChecks))
        put("secret_scanning", json.encodeToJsonElement(value.secretScanning))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46(block: InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46.Builder.() -> Unit): InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46 = InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCopilotCloudAgentConfigurationGetResponse200JsonEnabledToolsX1e732b46 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
