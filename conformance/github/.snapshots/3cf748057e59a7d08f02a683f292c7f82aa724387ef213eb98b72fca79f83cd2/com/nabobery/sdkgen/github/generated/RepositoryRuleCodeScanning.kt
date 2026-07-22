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
 * Choose which tools must provide code scanning results before the reference is updated. When configured, code scanning
 * must be enabled and have results for both the commit and the reference being updated.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-code-scanning
 */
@Serializable(with = RepositoryRuleCodeScanning.Serializer::class)
public class RepositoryRuleCodeScanning(
  public val type: InlineRepositoryRuleCodeScanningTypeX47dd9d07,
  public val parameters: InlineRepositoryRuleCodeScanningParametersXbc7402ab? = null,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleCodeScanningTypeX47dd9d07? = null

    public var type: InlineRepositoryRuleCodeScanningTypeX47dd9d07
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: InlineRepositoryRuleCodeScanningParametersXbc7402ab? = null

    public fun build(): RepositoryRuleCodeScanning {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleCodeScanning(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleCodeScanning = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleCodeScanning> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleCodeScanning {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleCodeScanning")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleCodeScanning must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleCodeScanningTypeX47dd9d07>(rawObject, "type")
      return RepositoryRuleCodeScanning(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleCodeScanningParametersXbc7402ab>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleCodeScanning) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleCodeScanning")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleCodeScanning(block: RepositoryRuleCodeScanning.Builder.() -> Unit): RepositoryRuleCodeScanning = RepositoryRuleCodeScanning.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleCodeScanning is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
