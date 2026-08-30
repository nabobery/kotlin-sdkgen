package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-update/properties/vulnerabilities/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-update/properties/vulnerabilities/items
 */
@Serializable(with = InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba.Serializer::class)
public class InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba internal constructor(
  /**
   * The name of the package affected by the vulnerability.
   */
  public val packageValue: InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca,
  private val patchedVersionsState: FieldState<String?>,
  vulnerableFunctionsState: FieldState<List<String>?>,
  private val vulnerableVersionRangeState: FieldState<String?>,
) {
  private val vulnerableFunctionsState: FieldState<List<String>?> =
      vulnerableFunctionsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  /**
   * The package version(s) that resolve the vulnerability.
   */
  public val patchedVersions: String?
    get() = patchedVersionsState.valueOrNull()

  /**
   * The functions in the package that are affected.
   */
  public val vulnerableFunctions: List<String>?
    get() = vulnerableFunctionsState.valueOrNull()

  /**
   * The range of the package versions affected by the vulnerability.
   */
  public val vulnerableVersionRange: String?
    get() = vulnerableVersionRangeState.valueOrNull()

  public constructor(packageValue: InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca) : this(packageValue = packageValue,
  patchedVersionsState = FieldState.Absent,
  vulnerableFunctionsState = FieldState.Absent,
  vulnerableVersionRangeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `patched_versions`.
   */
  public fun patchedVersionsPresence(): FieldPresence = patchedVersionsState.presence

  /**
   * Returns the wire presence of `vulnerable_functions`.
   */
  public fun vulnerableFunctionsPresence(): FieldPresence = vulnerableFunctionsState.presence

  /**
   * Returns the wire presence of `vulnerable_version_range`.
   */
  public fun vulnerableVersionRangePresence(): FieldPresence = vulnerableVersionRangeState.presence

  public class Builder {
    private var packageValueValue:
        InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca? = null

    public var packageValue: InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca
      get() = requireNotNull(packageValueValue) { "packageValue is required" }
      set(`value`) {
        packageValueValue = value
      }

    private var patchedVersionsState: FieldState<String?> = FieldState.Absent

    /**
     * The package version(s) that resolve the vulnerability.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var patchedVersions: String?
      get() = patchedVersionsState.valueOrNull()
      set(`value`) {
        patchedVersionsState = value.toNullableFieldState()
      }

    private var vulnerableFunctionsState: FieldState<List<String>?> = FieldState.Absent

    /**
     * The functions in the package that are affected.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var vulnerableFunctions: List<String>?
      get() = vulnerableFunctionsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        vulnerableFunctionsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var vulnerableVersionRangeState: FieldState<String?> = FieldState.Absent

    /**
     * The range of the package versions affected by the vulnerability.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var vulnerableVersionRange: String?
      get() = vulnerableVersionRangeState.valueOrNull()
      set(`value`) {
        vulnerableVersionRangeState = value.toNullableFieldState()
      }

    /**
     * Omits `patched_versions` from serialized output.
     */
    public fun unsetPatchedVersions() {
      patchedVersionsState = FieldState.Absent
    }

    /**
     * Omits `vulnerable_functions` from serialized output.
     */
    public fun unsetVulnerableFunctions() {
      vulnerableFunctionsState = FieldState.Absent
    }

    /**
     * Omits `vulnerable_version_range` from serialized output.
     */
    public fun unsetVulnerableVersionRange() {
      vulnerableVersionRangeState = FieldState.Absent
    }

    public fun build(): InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba {
      check(packageValueValue != null) { "packageValue is required" }
      return InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba(
        packageValue = packageValue,
        patchedVersionsState = patchedVersionsState,
        vulnerableFunctionsState = vulnerableFunctionsState,
        vulnerableVersionRangeState = vulnerableVersionRangeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba must be a JSON object")
      val packageValue = json.decodeRequired<InlineRepositoryAdvisoryUpdateVulnerabilitiesItemPackageValueXf0b919ca>(rawObject, "package")
      return InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba(
        packageValue = packageValue,
        patchedVersionsState = json.decodeOptional(rawObject, "patched_versions", nullable = true),
        vulnerableFunctionsState = json.decodeOptional(rawObject, "vulnerable_functions", nullable = true),
        vulnerableVersionRangeState = json.decodeOptional(rawObject, "vulnerable_version_range", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("package", json.encodeToJsonElement(value.packageValue))
        putState("patched_versions", value.patchedVersionsState, json::encodeToJsonElement)
        putState("vulnerable_functions", value.vulnerableFunctionsState, json::encodeToJsonElement)
        putState("vulnerable_version_range", value.vulnerableVersionRangeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba(block: InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba.Builder.() -> Unit): InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba = InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba property '" + name + "' is not nullable")
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
