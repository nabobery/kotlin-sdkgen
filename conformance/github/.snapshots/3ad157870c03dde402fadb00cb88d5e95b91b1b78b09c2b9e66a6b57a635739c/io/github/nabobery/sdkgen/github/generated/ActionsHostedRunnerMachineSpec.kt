package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Provides details of a particular machine spec.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-hosted-runner-machine-spec
 */
@Serializable(with = ActionsHostedRunnerMachineSpec.Serializer::class)
public class ActionsHostedRunnerMachineSpec(
  /**
   * The number of cores.
   */
  public val cpuCores: Int,
  /**
   * The ID used for the `size` parameter when creating a new runner.
   */
  public val id: String,
  /**
   * The available RAM for the machine spec.
   */
  public val memoryGb: Int,
  /**
   * The available SSD storage for the machine spec.
   */
  public val storageGb: Int,
) {
  public class Builder {
    private var cpuCoresValue: Int? = null

    public var cpuCores: Int
      get() = requireNotNull(cpuCoresValue) { "cpuCores is required" }
      set(`value`) {
        cpuCoresValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var memoryGbValue: Int? = null

    public var memoryGb: Int
      get() = requireNotNull(memoryGbValue) { "memoryGb is required" }
      set(`value`) {
        memoryGbValue = value
      }

    private var storageGbValue: Int? = null

    public var storageGb: Int
      get() = requireNotNull(storageGbValue) { "storageGb is required" }
      set(`value`) {
        storageGbValue = value
      }

    public fun build(): ActionsHostedRunnerMachineSpec {
      check(cpuCoresValue != null) { "cpuCores is required" }
      check(idValue != null) { "id is required" }
      check(memoryGbValue != null) { "memoryGb is required" }
      check(storageGbValue != null) { "storageGb is required" }
      return ActionsHostedRunnerMachineSpec(
        cpuCores = cpuCores,
        id = id,
        memoryGb = memoryGb,
        storageGb = storageGb,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsHostedRunnerMachineSpec = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsHostedRunnerMachineSpec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsHostedRunnerMachineSpec {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsHostedRunnerMachineSpec")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsHostedRunnerMachineSpec must be a JSON object")
      val cpuCores = json.decodeRequired<Int>(rawObject, "cpu_cores")
      val id = json.decodeRequired<String>(rawObject, "id")
      val memoryGb = json.decodeRequired<Int>(rawObject, "memory_gb")
      val storageGb = json.decodeRequired<Int>(rawObject, "storage_gb")
      return ActionsHostedRunnerMachineSpec(
        cpuCores = cpuCores,
        id = id,
        memoryGb = memoryGb,
        storageGb = storageGb,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsHostedRunnerMachineSpec) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsHostedRunnerMachineSpec")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cpu_cores", json.encodeToJsonElement(value.cpuCores))
        put("id", value.id)
        put("memory_gb", json.encodeToJsonElement(value.memoryGb))
        put("storage_gb", json.encodeToJsonElement(value.storageGb))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsHostedRunnerMachineSpec(block: ActionsHostedRunnerMachineSpec.Builder.() -> Unit): ActionsHostedRunnerMachineSpec = ActionsHostedRunnerMachineSpec.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsHostedRunnerMachineSpec is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
