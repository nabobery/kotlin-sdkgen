package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Chat completion response
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatResult
 */
@Serializable(with = ChatResult.Serializer::class)
public class ChatResult internal constructor(
  choices: List<ChatChoice>,
  /**
   * Unix timestamp of creation
   */
  public val created: Int,
  /**
   * Unique completion identifier
   */
  public val id: String,
  /**
   * Model used for completion
   */
  public val model: String,
  public val objectValue: InlineChatResultObjectValueX6c2339ef,
  /**
   * System fingerprint
   */
  public val systemFingerprint: String?,
  private val openrouterMetadataState: FieldState<OpenRouterMetadata>,
  private val serviceTierState: FieldState<String?>,
  private val usageState: FieldState<ChatUsage>,
) {
  /**
   * List of completion choices
   */
  public val choices: List<ChatChoice> = choices.toList()

  public val openrouterMetadata: OpenRouterMetadata?
    get() = openrouterMetadataState.valueOrNull()

  /**
   * The service tier used by the upstream provider for this request
   */
  public val serviceTier: String?
    get() = serviceTierState.valueOrNull()

  public val usage: ChatUsage?
    get() = usageState.valueOrNull()

  public constructor(
    choices: List<ChatChoice>,
    created: Int,
    id: String,
    model: String,
    objectValue: InlineChatResultObjectValueX6c2339ef,
    systemFingerprint: String?,
  ) : this(choices = choices,
  created = created,
  id = id,
  model = model,
  objectValue = objectValue,
  systemFingerprint = systemFingerprint,
  openrouterMetadataState = FieldState.Absent,
  serviceTierState = FieldState.Absent,
  usageState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `openrouter_metadata`.
   */
  public fun openrouterMetadataPresence(): FieldPresence = openrouterMetadataState.presence

  /**
   * Returns the wire presence of `service_tier`.
   */
  public fun serviceTierPresence(): FieldPresence = serviceTierState.presence

  /**
   * Returns the wire presence of `usage`.
   */
  public fun usagePresence(): FieldPresence = usageState.presence

  public class Builder {
    private var choicesValue: List<ChatChoice>? = null

    public var choices: List<ChatChoice>
      get() = requireNotNull(choicesValue) { "choices is required" }.toList()
      set(`value`) {
        choicesValue = value.toList()
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var objectValueValue: InlineChatResultObjectValueX6c2339ef? = null

    public var objectValue: InlineChatResultObjectValueX6c2339ef
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var systemFingerprintState: FieldState<String?> = FieldState.Absent

    /**
     * System fingerprint
     * Required nullable field; assigning `null` records present-null.
     */
    public var systemFingerprint: String?
      get() = systemFingerprintState.valueOrNull()
      set(`value`) {
        systemFingerprintState = value.toNullableFieldState()
      }

    private var openrouterMetadataState: FieldState<OpenRouterMetadata> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var openrouterMetadata: OpenRouterMetadata?
      get() = openrouterMetadataState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "openrouterMetadata is not nullable; call unsetOpenrouterMetadata() to omit it" }
        openrouterMetadataState = FieldState.Value(present)
      }

    private var serviceTierState: FieldState<String?> = FieldState.Absent

    /**
     * The service tier used by the upstream provider for this request
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var serviceTier: String?
      get() = serviceTierState.valueOrNull()
      set(`value`) {
        serviceTierState = value.toNullableFieldState()
      }

    private var usageState: FieldState<ChatUsage> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var usage: ChatUsage?
      get() = usageState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "usage is not nullable; call unsetUsage() to omit it" }
        usageState = FieldState.Value(present)
      }

    /**
     * Omits `openrouter_metadata` from serialized output.
     */
    public fun unsetOpenrouterMetadata() {
      openrouterMetadataState = FieldState.Absent
    }

    /**
     * Omits `service_tier` from serialized output.
     */
    public fun unsetServiceTier() {
      serviceTierState = FieldState.Absent
    }

    /**
     * Omits `usage` from serialized output.
     */
    public fun unsetUsage() {
      usageState = FieldState.Absent
    }

    public fun build(): ChatResult {
      check(choicesValue != null) { "choices is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(modelValue != null) { "model is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(systemFingerprintState !== FieldState.Absent) { "systemFingerprint is required, even when null" }
      return ChatResult(
        choices = choices,
        created = created,
        id = id,
        model = model,
        objectValue = objectValue,
        systemFingerprint = systemFingerprintState.valueOrNull(),
        openrouterMetadataState = openrouterMetadataState,
        serviceTierState = serviceTierState,
        usageState = usageState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatResult {
      val jsonDecoder = decoder.requireJsonDecoder("ChatResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatResult must be a JSON object")
      val choices = json.decodeRequired<List<ChatChoice>>(rawObject, "choices")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val model = json.decodeRequired<String>(rawObject, "model")
      val objectValue = json.decodeRequired<InlineChatResultObjectValueX6c2339ef>(rawObject, "object")
      if (!rawObject.containsKey("system_fingerprint")) {
        throw SerializationException("ChatResult is missing required property 'system_fingerprint'")
      }
      val systemFingerprint = rawObject["system_fingerprint"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ChatResult(
        choices = choices,
        created = created,
        id = id,
        model = model,
        objectValue = objectValue,
        systemFingerprint = systemFingerprint,
        openrouterMetadataState = json.decodeOptional(rawObject, "openrouter_metadata", nullable = false),
        serviceTierState = json.decodeOptional(rawObject, "service_tier", nullable = true),
        usageState = json.decodeOptional(rawObject, "usage", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatResult) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("choices", json.encodeToJsonElement(value.choices))
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("model", value.model)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("system_fingerprint", value.systemFingerprint?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("openrouter_metadata", value.openrouterMetadataState, json::encodeToJsonElement)
        putState("service_tier", value.serviceTierState, json::encodeToJsonElement)
        putState("usage", value.usageState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatResult(block: ChatResult.Builder.() -> Unit): ChatResult = ChatResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatResult is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ChatResult property '" + name + "' is not nullable")
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
