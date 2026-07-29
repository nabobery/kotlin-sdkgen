package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-code-scanning/properties/parameters.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-code-scanning/properties/parameters
 */
@Serializable(with = InlineRepositoryRuleCodeScanningParametersXbc7402ab.Serializer::class)
public class InlineRepositoryRuleCodeScanningParametersXbc7402ab(
  codeScanningTools: List<RepositoryRuleParamsCodeScanningTool>,
) {
  /**
   * Tools that must provide code scanning results for this rule to pass.
   */
  public val codeScanningTools: List<RepositoryRuleParamsCodeScanningTool> =
      codeScanningTools.toList()

  public class Builder {
    private var codeScanningToolsValue: List<RepositoryRuleParamsCodeScanningTool>? = null

    public var codeScanningTools: List<RepositoryRuleParamsCodeScanningTool>
      get() = requireNotNull(codeScanningToolsValue) { "codeScanningTools is required" }.toList()
      set(`value`) {
        codeScanningToolsValue = value.toList()
      }

    public fun build(): InlineRepositoryRuleCodeScanningParametersXbc7402ab {
      check(codeScanningToolsValue != null) { "codeScanningTools is required" }
      return InlineRepositoryRuleCodeScanningParametersXbc7402ab(
        codeScanningTools = codeScanningTools,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryRuleCodeScanningParametersXbc7402ab = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRepositoryRuleCodeScanningParametersXbc7402ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleCodeScanningParametersXbc7402ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryRuleCodeScanningParametersXbc7402ab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryRuleCodeScanningParametersXbc7402ab must be a JSON object")
      val codeScanningTools = json.decodeRequired<List<RepositoryRuleParamsCodeScanningTool>>(rawObject, "code_scanning_tools")
      return InlineRepositoryRuleCodeScanningParametersXbc7402ab(
        codeScanningTools = codeScanningTools,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleCodeScanningParametersXbc7402ab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryRuleCodeScanningParametersXbc7402ab")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code_scanning_tools", json.encodeToJsonElement(value.codeScanningTools))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryRuleCodeScanningParametersXbc7402ab(block: InlineRepositoryRuleCodeScanningParametersXbc7402ab.Builder.() -> Unit): InlineRepositoryRuleCodeScanningParametersXbc7402ab = InlineRepositoryRuleCodeScanningParametersXbc7402ab.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryRuleCodeScanningParametersXbc7402ab is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
