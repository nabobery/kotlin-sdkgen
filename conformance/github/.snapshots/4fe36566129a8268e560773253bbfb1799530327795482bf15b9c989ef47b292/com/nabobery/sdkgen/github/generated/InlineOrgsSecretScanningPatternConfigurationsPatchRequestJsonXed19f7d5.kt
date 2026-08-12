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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1pattern-configurations/patch/requestBody/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1pattern-configurations/patch/requestBody/content/
 * application~1json/schema
 */
@Serializable(with = InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5.Serializer::class)
public class InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5 internal constructor(
  customPatternSettingsState: FieldState<List<InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd>>,
  private val patternConfigVersionState: FieldState<String?>,
  providerPatternSettingsState: FieldState<List<InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4>>,
) {
  private val customPatternSettingsState:
      FieldState<List<InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd>>
      = customPatternSettingsState.copyValue { fieldValue -> fieldValue.toList() }

  private val providerPatternSettingsState:
      FieldState<List<InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4>> =
      providerPatternSettingsState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * Pattern settings for custom patterns.
   */
  public val customPatternSettings:
      List<InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd>?
    get() = customPatternSettingsState.valueOrNull()

  public val patternConfigVersion: String?
    get() = patternConfigVersionState.valueOrNull()

  /**
   * Pattern settings for provider patterns.
   */
  public val providerPatternSettings:
      List<InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4>?
    get() = providerPatternSettingsState.valueOrNull()

  public constructor() : this(customPatternSettingsState = FieldState.Absent,
  patternConfigVersionState = FieldState.Absent,
  providerPatternSettingsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `custom_pattern_settings`.
   */
  public fun customPatternSettingsPresence(): FieldPresence = customPatternSettingsState.presence

  /**
   * Returns the wire presence of `pattern_config_version`.
   */
  public fun patternConfigVersionPresence(): FieldPresence = patternConfigVersionState.presence

  /**
   * Returns the wire presence of `provider_pattern_settings`.
   */
  public fun providerPatternSettingsPresence(): FieldPresence = providerPatternSettingsState.presence

  public class Builder {
    private var customPatternSettingsState:
        FieldState<List<InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd>>
        = FieldState.Absent

    /**
     * Pattern settings for custom patterns.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var customPatternSettings:
        List<InlineOrgsSecretScanningPa19f9PatchRequestJsonCustomPatternSettingsItemXb8e22ccd>?
      get() = customPatternSettingsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "customPatternSettings is not nullable; call unsetCustomPatternSettings() to omit it" }
        customPatternSettingsState = FieldState.Value(present.toList())
      }

    private var patternConfigVersionState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var patternConfigVersion: String?
      get() = patternConfigVersionState.valueOrNull()
      set(`value`) {
        patternConfigVersionState = value.toNullableFieldState()
      }

    private var providerPatternSettingsState:
        FieldState<List<InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4>> =
        FieldState.Absent

    /**
     * Pattern settings for provider patterns.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var providerPatternSettings:
        List<InlineOrgsSecretScanningPa19f9PatchRequestJsonItemXc99403a4>?
      get() = providerPatternSettingsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "providerPatternSettings is not nullable; call unsetProviderPatternSettings() to omit it" }
        providerPatternSettingsState = FieldState.Value(present.toList())
      }

    /**
     * Omits `custom_pattern_settings` from serialized output.
     */
    public fun unsetCustomPatternSettings() {
      customPatternSettingsState = FieldState.Absent
    }

    /**
     * Omits `pattern_config_version` from serialized output.
     */
    public fun unsetPatternConfigVersion() {
      patternConfigVersionState = FieldState.Absent
    }

    /**
     * Omits `provider_pattern_settings` from serialized output.
     */
    public fun unsetProviderPatternSettings() {
      providerPatternSettingsState = FieldState.Absent
    }

    public fun build(): InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5 = InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5(
      customPatternSettingsState = customPatternSettingsState,
      patternConfigVersionState = patternConfigVersionState,
      providerPatternSettingsState = providerPatternSettingsState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5 must be a JSON object")
      return InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5(
        customPatternSettingsState = json.decodeOptional(rawObject, "custom_pattern_settings", nullable = false),
        patternConfigVersionState = json.decodeOptional(rawObject, "pattern_config_version", nullable = true),
        providerPatternSettingsState = json.decodeOptional(rawObject, "provider_pattern_settings", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("custom_pattern_settings", value.customPatternSettingsState, json::encodeToJsonElement)
        putState("pattern_config_version", value.patternConfigVersionState, json::encodeToJsonElement)
        putState("provider_pattern_settings", value.providerPatternSettingsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5(block: InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5.Builder.() -> Unit): InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5 = InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5.build(block)

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
    if (!nullable) throw SerializationException("InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5 property '" + name + "' is not nullable")
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
