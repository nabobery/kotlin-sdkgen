package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The name of the package affected by the vulnerability.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-update/properties/vulnerabilities/items/properti
 * es/package
 */
@Serializable(with = InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca.Serializer::class)
public class InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca internal constructor(
  public val ecosystem: SecurityAdvisoryEcosystems,
  private val nameState: FieldState<String?>,
) {
  /**
   * The unique package name within its ecosystem.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  public constructor(ecosystem: SecurityAdvisoryEcosystems) : this(ecosystem = ecosystem,
  nameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  public class Builder {
    private var ecosystemValue: SecurityAdvisoryEcosystems? = null

    public var ecosystem: SecurityAdvisoryEcosystems
      get() = requireNotNull(ecosystemValue) { "ecosystem is required" }
      set(`value`) {
        ecosystemValue = value
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * The unique package name within its ecosystem.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    public fun build(): InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca {
      check(ecosystemValue != null) { "ecosystem is required" }
      return InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca(
        ecosystem = ecosystem,
        nameState = nameState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca must be a JSON object")
      val ecosystem = json.decodeRequired<SecurityAdvisoryEcosystems>(rawObject, "ecosystem")
      return InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca(
        ecosystem = ecosystem,
        nameState = json.decodeOptional(rawObject, "name", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ecosystem", json.encodeToJsonElement(value.ecosystem))
        putState("name", value.nameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca(block: InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca.Builder.() -> Unit): InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca = InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca property '" + name + "' is not nullable")
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
