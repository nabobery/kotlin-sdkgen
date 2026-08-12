package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1machine-sizes/get/responses/200/content/a
 * pplication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1machine-sizes/get/responses/200/content/a
 * pplication~1json/schema
 */
@Serializable(with = InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8.Serializer::class)
public class InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8(
  machineSpecs: List<ActionsHostedRunnerMachineSpec>,
  public val totalCount: Int,
) {
  public val machineSpecs: List<ActionsHostedRunnerMachineSpec> = machineSpecs.toList()

  public class Builder {
    private var machineSpecsValue: List<ActionsHostedRunnerMachineSpec>? = null

    public var machineSpecs: List<ActionsHostedRunnerMachineSpec>
      get() = requireNotNull(machineSpecsValue) { "machineSpecs is required" }.toList()
      set(`value`) {
        machineSpecsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8 {
      check(machineSpecsValue != null) { "machineSpecs is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8(
        machineSpecs = machineSpecs,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8 must be a JSON object")
      val machineSpecs = json.decodeRequired<List<ActionsHostedRunnerMachineSpec>>(rawObject, "machine_specs")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8(
        machineSpecs = machineSpecs,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("machine_specs", json.encodeToJsonElement(value.machineSpecs))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8(block: InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8.Builder.() -> Unit): InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8 = InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsHostedRunnersMachineSizesGetResponse200JsonX4430d7b8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
