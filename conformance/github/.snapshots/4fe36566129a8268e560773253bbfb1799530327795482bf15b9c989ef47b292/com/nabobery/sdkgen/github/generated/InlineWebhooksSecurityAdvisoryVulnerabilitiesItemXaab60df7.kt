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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/vulnerabilities/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_security_advisory/properties/vulnerabilities/items
 */
@Serializable(with = InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7.Serializer::class)
public class InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7(
  public val firstPatchedVersion:
      InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0?,
  public val packageValue: InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6,
  public val severity: String,
  public val vulnerableVersionRange: String,
) {
  public class Builder {
    private var packageValueValue:
        InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6? = null

    public var packageValue: InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6
      get() = requireNotNull(packageValueValue) { "packageValue is required" }
      set(`value`) {
        packageValueValue = value
      }

    private var severityValue: String? = null

    public var severity: String
      get() = requireNotNull(severityValue) { "severity is required" }
      set(`value`) {
        severityValue = value
      }

    private var vulnerableVersionRangeValue: String? = null

    public var vulnerableVersionRange: String
      get() = requireNotNull(vulnerableVersionRangeValue) { "vulnerableVersionRange is required" }
      set(`value`) {
        vulnerableVersionRangeValue = value
      }

    private var firstPatchedVersionState:
        FieldState<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var firstPatchedVersion:
        InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0?
      get() = firstPatchedVersionState.valueOrNull()
      set(`value`) {
        firstPatchedVersionState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7 {
      check(packageValueValue != null) { "packageValue is required" }
      check(severityValue != null) { "severity is required" }
      check(vulnerableVersionRangeValue != null) { "vulnerableVersionRange is required" }
      check(firstPatchedVersionState !== FieldState.Absent) { "firstPatchedVersion is required, even when null" }
      return InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7(
        firstPatchedVersion = firstPatchedVersionState.valueOrNull(),
        packageValue = packageValue,
        severity = severity,
        vulnerableVersionRange = vulnerableVersionRange,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7 must be a JSON object")
      val packageValue = json.decodeRequired<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemPackageValueX3df8e8a6>(rawObject, "package")
      val severity = json.decodeRequired<String>(rawObject, "severity")
      val vulnerableVersionRange = json.decodeRequired<String>(rawObject, "vulnerable_version_range")
      if (!rawObject.containsKey("first_patched_version")) {
        throw SerializationException("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7 is missing required property 'first_patched_version'")
      }
      val firstPatchedVersion = rawObject["first_patched_version"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksSecurityAdvisoryVulnerabilitiesItemFirstPatchedVersionX13d30aa0?>(requireNotNull(element)) }
      return InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7(
        firstPatchedVersion = firstPatchedVersion,
        packageValue = packageValue,
        severity = severity,
        vulnerableVersionRange = vulnerableVersionRange,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("first_patched_version", value.firstPatchedVersion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("package", json.encodeToJsonElement(value.packageValue))
        put("severity", value.severity)
        put("vulnerable_version_range", value.vulnerableVersionRange)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7(block: InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7.Builder.() -> Unit): InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7 = InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhooksSecurityAdvisoryVulnerabilitiesItemXaab60df7 property '" + name + "' is not nullable")
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
