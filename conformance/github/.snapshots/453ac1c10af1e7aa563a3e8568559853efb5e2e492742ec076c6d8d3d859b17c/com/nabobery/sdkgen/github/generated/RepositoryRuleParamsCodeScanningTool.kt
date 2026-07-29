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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A tool that must provide code scanning results for this rule to pass.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-code-scanning-tool
 */
@Serializable(with = RepositoryRuleParamsCodeScanningTool.Serializer::class)
public class RepositoryRuleParamsCodeScanningTool(
  /**
   * The severity level at which code scanning results that raise alerts block a reference update. For more information
   * on alert severity levels, see "[About code scanning
   * alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alert
   * s#about-alert-severity-and-security-severity-levels)."
   */
  public val alertsThreshold: InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d,
  /**
   * The severity level at which code scanning results that raise security alerts block a reference update. For more
   * information on security severity levels, see "[About code scanning
   * alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alert
   * s#about-alert-severity-and-security-severity-levels)."
   */
  public val securityAlertsThreshold:
      InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7,
  /**
   * The name of a code scanning tool
   */
  public val tool: String,
) {
  public class Builder {
    private var alertsThresholdValue:
        InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d? = null

    public var alertsThreshold: InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d
      get() = requireNotNull(alertsThresholdValue) { "alertsThreshold is required" }
      set(`value`) {
        alertsThresholdValue = value
      }

    private var securityAlertsThresholdValue:
        InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7? = null

    public var securityAlertsThreshold:
        InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7
      get() = requireNotNull(securityAlertsThresholdValue) { "securityAlertsThreshold is required" }
      set(`value`) {
        securityAlertsThresholdValue = value
      }

    private var toolValue: String? = null

    public var tool: String
      get() = requireNotNull(toolValue) { "tool is required" }
      set(`value`) {
        toolValue = value
      }

    public fun build(): RepositoryRuleParamsCodeScanningTool {
      check(alertsThresholdValue != null) { "alertsThreshold is required" }
      check(securityAlertsThresholdValue != null) { "securityAlertsThreshold is required" }
      check(toolValue != null) { "tool is required" }
      return RepositoryRuleParamsCodeScanningTool(
        alertsThreshold = alertsThreshold,
        securityAlertsThreshold = securityAlertsThreshold,
        tool = tool,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleParamsCodeScanningTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleParamsCodeScanningTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleParamsCodeScanningTool {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleParamsCodeScanningTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleParamsCodeScanningTool must be a JSON object")
      val alertsThreshold = json.decodeRequired<InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d>(rawObject, "alerts_threshold")
      val securityAlertsThreshold = json.decodeRequired<InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7>(rawObject, "security_alerts_threshold")
      val tool = json.decodeRequired<String>(rawObject, "tool")
      return RepositoryRuleParamsCodeScanningTool(
        alertsThreshold = alertsThreshold,
        securityAlertsThreshold = securityAlertsThreshold,
        tool = tool,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleParamsCodeScanningTool) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleParamsCodeScanningTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("alerts_threshold", json.encodeToJsonElement(value.alertsThreshold))
        put("security_alerts_threshold", json.encodeToJsonElement(value.securityAlertsThreshold))
        put("tool", value.tool)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleParamsCodeScanningTool(block: RepositoryRuleParamsCodeScanningTool.Builder.() -> Unit): RepositoryRuleParamsCodeScanningTool = RepositoryRuleParamsCodeScanningTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleParamsCodeScanningTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
