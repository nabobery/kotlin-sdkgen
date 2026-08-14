package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A description of the machine powering a codespace.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-codespace-machine
 */
@Serializable(with = NullableCodespaceMachine.Serializer::class)
public class NullableCodespaceMachine(
  /**
   * How many cores are available to the codespace.
   */
  public val cpus: Int,
  /**
   * The display name of the machine includes cores, memory, and storage.
   */
  public val displayName: String,
  /**
   * How much memory is available to the codespace.
   */
  public val memoryInBytes: Int,
  /**
   * The name of the machine.
   */
  public val name: String,
  /**
   * The operating system of the machine.
   */
  public val operatingSystem: String,
  /**
   * Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch
   * was not specified as a ref, the default branch will be assumed. Value will be "null" if prebuilds are not supported
   * or prebuild availability could not be determined. Value will be "none" if no prebuild is available. Latest values
   * "ready" and "in_progress" indicate the prebuild availability status.
   */
  public val prebuildAvailability: InlineNullableCodespaceMachinePrebuildAvailabilityXb05d8385?,
  /**
   * How much storage is available to the codespace.
   */
  public val storageInBytes: Int,
) {
  public class Builder {
    private var cpusValue: Int? = null

    public var cpus: Int
      get() = requireNotNull(cpusValue) { "cpus is required" }
      set(`value`) {
        cpusValue = value
      }

    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    private var memoryInBytesValue: Int? = null

    public var memoryInBytes: Int
      get() = requireNotNull(memoryInBytesValue) { "memoryInBytes is required" }
      set(`value`) {
        memoryInBytesValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var operatingSystemValue: String? = null

    public var operatingSystem: String
      get() = requireNotNull(operatingSystemValue) { "operatingSystem is required" }
      set(`value`) {
        operatingSystemValue = value
      }

    private var storageInBytesValue: Int? = null

    public var storageInBytes: Int
      get() = requireNotNull(storageInBytesValue) { "storageInBytes is required" }
      set(`value`) {
        storageInBytesValue = value
      }

    private var prebuildAvailabilityState:
        FieldState<InlineNullableCodespaceMachinePrebuildAvailabilityXb05d8385?> = FieldState.Absent

    /**
     * Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch
     * was not specified as a ref, the default branch will be assumed. Value will be "null" if prebuilds are not
     * supported or prebuild availability could not be determined. Value will be "none" if no prebuild is available.
     * Latest values "ready" and "in_progress" indicate the prebuild availability status.
     * Required nullable field; assigning `null` records present-null.
     */
    public var prebuildAvailability: InlineNullableCodespaceMachinePrebuildAvailabilityXb05d8385?
      get() = prebuildAvailabilityState.valueOrNull()
      set(`value`) {
        prebuildAvailabilityState = value.toNullableFieldState()
      }

    public fun build(): NullableCodespaceMachine {
      check(cpusValue != null) { "cpus is required" }
      check(displayNameValue != null) { "displayName is required" }
      check(memoryInBytesValue != null) { "memoryInBytes is required" }
      check(nameValue != null) { "name is required" }
      check(operatingSystemValue != null) { "operatingSystem is required" }
      check(storageInBytesValue != null) { "storageInBytes is required" }
      check(prebuildAvailabilityState !== FieldState.Absent) { "prebuildAvailability is required, even when null" }
      return NullableCodespaceMachine(
        cpus = cpus,
        displayName = displayName,
        memoryInBytes = memoryInBytes,
        name = name,
        operatingSystem = operatingSystem,
        prebuildAvailability = prebuildAvailabilityState.valueOrNull(),
        storageInBytes = storageInBytes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NullableCodespaceMachine = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<NullableCodespaceMachine> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NullableCodespaceMachine {
      val jsonDecoder = decoder.requireJsonDecoder("NullableCodespaceMachine")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NullableCodespaceMachine must be a JSON object")
      val cpus = json.decodeRequired<Int>(rawObject, "cpus")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val memoryInBytes = json.decodeRequired<Int>(rawObject, "memory_in_bytes")
      val name = json.decodeRequired<String>(rawObject, "name")
      val operatingSystem = json.decodeRequired<String>(rawObject, "operating_system")
      val storageInBytes = json.decodeRequired<Int>(rawObject, "storage_in_bytes")
      if (!rawObject.containsKey("prebuild_availability")) {
        throw SerializationException("NullableCodespaceMachine is missing required property 'prebuild_availability'")
      }
      val prebuildAvailability = rawObject["prebuild_availability"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineNullableCodespaceMachinePrebuildAvailabilityXb05d8385?>(requireNotNull(element)) }
      return NullableCodespaceMachine(
        cpus = cpus,
        displayName = displayName,
        memoryInBytes = memoryInBytes,
        name = name,
        operatingSystem = operatingSystem,
        prebuildAvailability = prebuildAvailability,
        storageInBytes = storageInBytes,
      )
    }

    override fun serialize(encoder: Encoder, `value`: NullableCodespaceMachine) {
      val jsonEncoder = encoder.requireJsonEncoder("NullableCodespaceMachine")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cpus", json.encodeToJsonElement(value.cpus))
        put("display_name", value.displayName)
        put("memory_in_bytes", json.encodeToJsonElement(value.memoryInBytes))
        put("name", value.name)
        put("operating_system", value.operatingSystem)
        put("prebuild_availability", value.prebuildAvailability?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("storage_in_bytes", json.encodeToJsonElement(value.storageInBytes))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun nullableCodespaceMachine(block: NullableCodespaceMachine.Builder.() -> Unit): NullableCodespaceMachine = NullableCodespaceMachine.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NullableCodespaceMachine is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("NullableCodespaceMachine property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
