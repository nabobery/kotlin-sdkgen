package com.nabobery.sdkgen.generated

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
 * Non-streaming response from the Anthropic Messages API with OpenRouter extensions
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesResult
 */
@Serializable(with = MessagesResult.Serializer::class)
public class MessagesResult internal constructor(
  public val container: AnthropicContainer?,
  content: List<OrAnthropicContentBlock>,
  public val id: String,
  public val model: String,
  public val role: InlineBaseMessagesResultRoleXcc22a0f6,
  public val stopDetails: AnthropicRefusalStopDetails?,
  public val stopReason: OrAnthropicStopReason?,
  public val stopSequence: String?,
  public val type: InlineBaseMessagesResultTypeXf865734d,
  public val usage: InlineMessagesResultAllOf2UsageX81dc147b,
  private val contextManagementState:
      FieldState<InlineMessagesResultAllOf2ContextManagementXf21391be?>,
  private val openrouterMetadataState: FieldState<OpenRouterMetadata>,
  private val providerState: FieldState<ProviderName>,
) {
  public val content: List<OrAnthropicContentBlock> = content.toList()

  public val contextManagement: InlineMessagesResultAllOf2ContextManagementXf21391be?
    get() = contextManagementState.valueOrNull()

  public val openrouterMetadata: OpenRouterMetadata?
    get() = openrouterMetadataState.valueOrNull()

  public val provider: ProviderName?
    get() = providerState.valueOrNull()

  public constructor(
    container: AnthropicContainer?,
    content: List<OrAnthropicContentBlock>,
    id: String,
    model: String,
    role: InlineBaseMessagesResultRoleXcc22a0f6,
    stopDetails: AnthropicRefusalStopDetails?,
    stopReason: OrAnthropicStopReason?,
    stopSequence: String?,
    type: InlineBaseMessagesResultTypeXf865734d,
    usage: InlineMessagesResultAllOf2UsageX81dc147b,
  ) : this(container = container,
  content = content,
  id = id,
  model = model,
  role = role,
  stopDetails = stopDetails,
  stopReason = stopReason,
  stopSequence = stopSequence,
  type = type,
  usage = usage,
  contextManagementState = FieldState.Absent,
  openrouterMetadataState = FieldState.Absent,
  providerState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `context_management`.
   */
  public fun contextManagementPresence(): FieldPresence = contextManagementState.presence

  /**
   * Returns the wire presence of `openrouter_metadata`.
   */
  public fun openrouterMetadataPresence(): FieldPresence = openrouterMetadataState.presence

  /**
   * Returns the wire presence of `provider`.
   */
  public fun providerPresence(): FieldPresence = providerState.presence

  public class Builder {
    private var contentValue: List<OrAnthropicContentBlock>? = null

    public var content: List<OrAnthropicContentBlock>
      get() = requireNotNull(contentValue) { "content is required" }.toList()
      set(`value`) {
        contentValue = value.toList()
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

    private var roleValue: InlineBaseMessagesResultRoleXcc22a0f6? = null

    public var role: InlineBaseMessagesResultRoleXcc22a0f6
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var typeValue: InlineBaseMessagesResultTypeXf865734d? = null

    public var type: InlineBaseMessagesResultTypeXf865734d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var usageValue: InlineMessagesResultAllOf2UsageX81dc147b? = null

    public var usage: InlineMessagesResultAllOf2UsageX81dc147b
      get() = requireNotNull(usageValue) { "usage is required" }
      set(`value`) {
        usageValue = value
      }

    private var containerState: FieldState<AnthropicContainer?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var container: AnthropicContainer?
      get() = containerState.valueOrNull()
      set(`value`) {
        containerState = value.toNullableFieldState()
      }

    private var stopDetailsState: FieldState<AnthropicRefusalStopDetails?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var stopDetails: AnthropicRefusalStopDetails?
      get() = stopDetailsState.valueOrNull()
      set(`value`) {
        stopDetailsState = value.toNullableFieldState()
      }

    private var stopReasonState: FieldState<OrAnthropicStopReason?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var stopReason: OrAnthropicStopReason?
      get() = stopReasonState.valueOrNull()
      set(`value`) {
        stopReasonState = value.toNullableFieldState()
      }

    private var stopSequenceState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var stopSequence: String?
      get() = stopSequenceState.valueOrNull()
      set(`value`) {
        stopSequenceState = value.toNullableFieldState()
      }

    private var contextManagementState:
        FieldState<InlineMessagesResultAllOf2ContextManagementXf21391be?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var contextManagement: InlineMessagesResultAllOf2ContextManagementXf21391be?
      get() = contextManagementState.valueOrNull()
      set(`value`) {
        contextManagementState = value.toNullableFieldState()
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

    private var providerState: FieldState<ProviderName> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var provider: ProviderName?
      get() = providerState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "provider is not nullable; call unsetProvider() to omit it" }
        providerState = FieldState.Value(present)
      }

    /**
     * Omits `context_management` from serialized output.
     */
    public fun unsetContextManagement() {
      contextManagementState = FieldState.Absent
    }

    /**
     * Omits `openrouter_metadata` from serialized output.
     */
    public fun unsetOpenrouterMetadata() {
      openrouterMetadataState = FieldState.Absent
    }

    /**
     * Omits `provider` from serialized output.
     */
    public fun unsetProvider() {
      providerState = FieldState.Absent
    }

    public fun build(): MessagesResult {
      check(contentValue != null) { "content is required" }
      check(idValue != null) { "id is required" }
      check(modelValue != null) { "model is required" }
      check(roleValue != null) { "role is required" }
      check(typeValue != null) { "type is required" }
      check(usageValue != null) { "usage is required" }
      check(containerState !== FieldState.Absent) { "container is required, even when null" }
      check(stopDetailsState !== FieldState.Absent) { "stopDetails is required, even when null" }
      check(stopReasonState !== FieldState.Absent) { "stopReason is required, even when null" }
      check(stopSequenceState !== FieldState.Absent) { "stopSequence is required, even when null" }
      return MessagesResult(
        container = containerState.valueOrNull(),
        content = content,
        id = id,
        model = model,
        role = role,
        stopDetails = stopDetailsState.valueOrNull(),
        stopReason = stopReasonState.valueOrNull(),
        stopSequence = stopSequenceState.valueOrNull(),
        type = type,
        usage = usage,
        contextManagementState = contextManagementState,
        openrouterMetadataState = openrouterMetadataState,
        providerState = providerState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesResult = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesResult> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesResult {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesResult")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesResult must be a JSON object")
      val content = json.decodeRequired<List<OrAnthropicContentBlock>>(rawObject, "content")
      val id = json.decodeRequired<String>(rawObject, "id")
      val model = json.decodeRequired<String>(rawObject, "model")
      val role = json.decodeRequired<InlineBaseMessagesResultRoleXcc22a0f6>(rawObject, "role")
      val type = json.decodeRequired<InlineBaseMessagesResultTypeXf865734d>(rawObject, "type")
      val usage = json.decodeRequired<InlineMessagesResultAllOf2UsageX81dc147b>(rawObject, "usage")
      if (!rawObject.containsKey("container")) {
        throw SerializationException("MessagesResult is missing required property 'container'")
      }
      val container = rawObject["container"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicContainer?>(requireNotNull(element)) }
      if (!rawObject.containsKey("stop_details")) {
        throw SerializationException("MessagesResult is missing required property 'stop_details'")
      }
      val stopDetails = rawObject["stop_details"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<AnthropicRefusalStopDetails?>(requireNotNull(element)) }
      if (!rawObject.containsKey("stop_reason")) {
        throw SerializationException("MessagesResult is missing required property 'stop_reason'")
      }
      val stopReason = rawObject["stop_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<OrAnthropicStopReason?>(requireNotNull(element)) }
      if (!rawObject.containsKey("stop_sequence")) {
        throw SerializationException("MessagesResult is missing required property 'stop_sequence'")
      }
      val stopSequence = rawObject["stop_sequence"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return MessagesResult(
        container = container,
        content = content,
        id = id,
        model = model,
        role = role,
        stopDetails = stopDetails,
        stopReason = stopReason,
        stopSequence = stopSequence,
        type = type,
        usage = usage,
        contextManagementState = json.decodeOptional(rawObject, "context_management", nullable = true),
        openrouterMetadataState = json.decodeOptional(rawObject, "openrouter_metadata", nullable = false),
        providerState = json.decodeOptional(rawObject, "provider", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesResult) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesResult")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("container", value.container?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("content", json.encodeToJsonElement(value.content))
        put("id", value.id)
        put("model", value.model)
        put("role", json.encodeToJsonElement(value.role))
        put("stop_details", value.stopDetails?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("stop_reason", value.stopReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("stop_sequence", value.stopSequence?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
        put("usage", json.encodeToJsonElement(value.usage))
        putState("context_management", value.contextManagementState, json::encodeToJsonElement)
        putState("openrouter_metadata", value.openrouterMetadataState, json::encodeToJsonElement)
        putState("provider", value.providerState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesResult(block: MessagesResult.Builder.() -> Unit): MessagesResult = MessagesResult.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesResult is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("MessagesResult property '" + name + "' is not nullable")
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
