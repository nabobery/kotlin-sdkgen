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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1pattern-configurations/patch/requestBody/content/
 * application~1json/schema/properties/custom_pattern_settings/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1pattern-configurations/patch/requestBody/content/
 * application~1json/schema/properties/custom_pattern_settings/items
 */
@Serializable(with = InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd.Serializer::class)
public class InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd internal constructor(
  private val customPatternVersionState: FieldState<String?>,
  private val pushProtectionSettingState:
      FieldState<InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54>,
  private val tokenTypeState: FieldState<String>,
) {
  public val customPatternVersion: String?
    get() = customPatternVersionState.valueOrNull()

  /**
   * Push protection setting to set for the pattern.
   */
  public val pushProtectionSetting:
      InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54?
    get() = pushProtectionSettingState.valueOrNull()

  /**
   * The ID of the pattern to configure.
   */
  public val tokenType: String?
    get() = tokenTypeState.valueOrNull()

  public constructor() : this(customPatternVersionState = FieldState.Absent,
  pushProtectionSettingState = FieldState.Absent,
  tokenTypeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `custom_pattern_version`.
   */
  public fun customPatternVersionPresence(): FieldPresence = customPatternVersionState.presence

  /**
   * Returns the wire presence of `push_protection_setting`.
   */
  public fun pushProtectionSettingPresence(): FieldPresence = pushProtectionSettingState.presence

  /**
   * Returns the wire presence of `token_type`.
   */
  public fun tokenTypePresence(): FieldPresence = tokenTypeState.presence

  public class Builder {
    private var customPatternVersionState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var customPatternVersion: String?
      get() = customPatternVersionState.valueOrNull()
      set(`value`) {
        customPatternVersionState = value.toNullableFieldState()
      }

    private var pushProtectionSettingState:
        FieldState<InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54> =
        FieldState.Absent

    /**
     * Push protection setting to set for the pattern.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var pushProtectionSetting:
        InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54?
      get() = pushProtectionSettingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "pushProtectionSetting is not nullable; call unsetPushProtectionSetting() to omit it" }
        pushProtectionSettingState = FieldState.Value(present)
      }

    private var tokenTypeState: FieldState<String> = FieldState.Absent

    /**
     * The ID of the pattern to configure.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var tokenType: String?
      get() = tokenTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "tokenType is not nullable; call unsetTokenType() to omit it" }
        tokenTypeState = FieldState.Value(present)
      }

    /**
     * Omits `custom_pattern_version` from serialized output.
     */
    public fun unsetCustomPatternVersion() {
      customPatternVersionState = FieldState.Absent
    }

    /**
     * Omits `push_protection_setting` from serialized output.
     */
    public fun unsetPushProtectionSetting() {
      pushProtectionSettingState = FieldState.Absent
    }

    /**
     * Omits `token_type` from serialized output.
     */
    public fun unsetTokenType() {
      tokenTypeState = FieldState.Absent
    }

    public fun build(): InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd = InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd(
      customPatternVersionState = customPatternVersionState,
      pushProtectionSettingState = pushProtectionSettingState,
      tokenTypeState = tokenTypeState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd must be a JSON object")
      return InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd(
        customPatternVersionState = json.decodeOptional(rawObject, "custom_pattern_version", nullable = true),
        pushProtectionSettingState = json.decodeOptional(rawObject, "push_protection_setting", nullable = false),
        tokenTypeState = json.decodeOptional(rawObject, "token_type", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("custom_pattern_version", value.customPatternVersionState, json::encodeToJsonElement)
        putState("push_protection_setting", value.pushProtectionSettingState, json::encodeToJsonElement)
        putState("token_type", value.tokenTypeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd(block: InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd.Builder.() -> Unit): InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd = InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd property '" + name + "' is not nullable")
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
