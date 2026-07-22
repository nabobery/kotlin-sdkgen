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
 * Enforce any added or changed dependencies to comply with the organization's license policy.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-license-compliance-scanning
 */
@Serializable(with = RepositoryRuleLicenseComplianceScanning.Serializer::class)
public class RepositoryRuleLicenseComplianceScanning(
  public val type: InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf,
) {
  public class Builder {
    private var typeValue: InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf? = null

    public var type: InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): RepositoryRuleLicenseComplianceScanning {
      check(typeValue != null) { "type is required" }
      return RepositoryRuleLicenseComplianceScanning(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleLicenseComplianceScanning = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleLicenseComplianceScanning> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleLicenseComplianceScanning {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleLicenseComplianceScanning")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleLicenseComplianceScanning must be a JSON object")
      val type = json.decodeRequired<InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf>(rawObject, "type")
      return RepositoryRuleLicenseComplianceScanning(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleLicenseComplianceScanning) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleLicenseComplianceScanning")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleLicenseComplianceScanning(block: RepositoryRuleLicenseComplianceScanning.Builder.() -> Unit): RepositoryRuleLicenseComplianceScanning = RepositoryRuleLicenseComplianceScanning.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleLicenseComplianceScanning is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
