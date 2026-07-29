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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}/patch/requestBody/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}/patch/requestBody/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineReposPullsPatchRequestJsonXb9c81491.Serializer::class)
public class InlineReposPullsPatchRequestJsonXb9c81491 internal constructor(
  private val baseState: FieldState<String>,
  private val bodyState: FieldState<String>,
  private val maintainerCanModifyState: FieldState<Boolean>,
  private val stateState: FieldState<InlineReposPullsPatchRequestJsonStateX11706762>,
  private val titleState: FieldState<String>,
) {
  /**
   * The name of the branch you want your changes pulled into. This should be an existing branch on the current
   * repository. You cannot update the base branch on a pull request to point to another repository.
   */
  public val base: String?
    get() = baseState.valueOrNull()

  /**
   * The contents of the pull request.
   */
  public val body: String?
    get() = bodyState.valueOrNull()

  /**
   * Indicates whether [maintainers can
   * modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull
   * request.
   */
  public val maintainerCanModify: Boolean?
    get() = maintainerCanModifyState.valueOrNull()

  /**
   * State of this Pull Request. Either `open` or `closed`.
   */
  public val state: InlineReposPullsPatchRequestJsonStateX11706762?
    get() = stateState.valueOrNull()

  /**
   * The title of the pull request.
   */
  public val title: String?
    get() = titleState.valueOrNull()

  public constructor() : this(baseState = FieldState.Absent,
  bodyState = FieldState.Absent,
  maintainerCanModifyState = FieldState.Absent,
  stateState = FieldState.Absent,
  titleState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `base`.
   */
  public fun basePresence(): FieldPresence = baseState.presence

  /**
   * Returns the wire presence of `body`.
   */
  public fun bodyPresence(): FieldPresence = bodyState.presence

  /**
   * Returns the wire presence of `maintainer_can_modify`.
   */
  public fun maintainerCanModifyPresence(): FieldPresence = maintainerCanModifyState.presence

  /**
   * Returns the wire presence of `state`.
   */
  public fun statePresence(): FieldPresence = stateState.presence

  /**
   * Returns the wire presence of `title`.
   */
  public fun titlePresence(): FieldPresence = titleState.presence

  public class Builder {
    private var baseState: FieldState<String> = FieldState.Absent

    /**
     * The name of the branch you want your changes pulled into. This should be an existing branch on the current
     * repository. You cannot update the base branch on a pull request to point to another repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var base: String?
      get() = baseState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "base is not nullable; call unsetBase() to omit it" }
        baseState = FieldState.Value(present)
      }

    private var bodyState: FieldState<String> = FieldState.Absent

    /**
     * The contents of the pull request.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "body is not nullable; call unsetBody() to omit it" }
        bodyState = FieldState.Value(present)
      }

    private var maintainerCanModifyState: FieldState<Boolean> = FieldState.Absent

    /**
     * Indicates whether [maintainers can
     * modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull
     * request.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var maintainerCanModify: Boolean?
      get() = maintainerCanModifyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "maintainerCanModify is not nullable; call unsetMaintainerCanModify() to omit it" }
        maintainerCanModifyState = FieldState.Value(present)
      }

    private var stateState: FieldState<InlineReposPullsPatchRequestJsonStateX11706762> =
        FieldState.Absent

    /**
     * State of this Pull Request. Either `open` or `closed`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var state: InlineReposPullsPatchRequestJsonStateX11706762?
      get() = stateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "state is not nullable; call unsetState() to omit it" }
        stateState = FieldState.Value(present)
      }

    private var titleState: FieldState<String> = FieldState.Absent

    /**
     * The title of the pull request.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var title: String?
      get() = titleState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "title is not nullable; call unsetTitle() to omit it" }
        titleState = FieldState.Value(present)
      }

    /**
     * Omits `base` from serialized output.
     */
    public fun unsetBase() {
      baseState = FieldState.Absent
    }

    /**
     * Omits `body` from serialized output.
     */
    public fun unsetBody() {
      bodyState = FieldState.Absent
    }

    /**
     * Omits `maintainer_can_modify` from serialized output.
     */
    public fun unsetMaintainerCanModify() {
      maintainerCanModifyState = FieldState.Absent
    }

    /**
     * Omits `state` from serialized output.
     */
    public fun unsetState() {
      stateState = FieldState.Absent
    }

    /**
     * Omits `title` from serialized output.
     */
    public fun unsetTitle() {
      titleState = FieldState.Absent
    }

    public fun build(): InlineReposPullsPatchRequestJsonXb9c81491 = InlineReposPullsPatchRequestJsonXb9c81491(
      baseState = baseState,
      bodyState = bodyState,
      maintainerCanModifyState = maintainerCanModifyState,
      stateState = stateState,
      titleState = titleState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsPatchRequestJsonXb9c81491 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposPullsPatchRequestJsonXb9c81491> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsPatchRequestJsonXb9c81491 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsPatchRequestJsonXb9c81491")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsPatchRequestJsonXb9c81491 must be a JSON object")
      return InlineReposPullsPatchRequestJsonXb9c81491(
        baseState = json.decodeOptional(rawObject, "base", nullable = false),
        bodyState = json.decodeOptional(rawObject, "body", nullable = false),
        maintainerCanModifyState = json.decodeOptional(rawObject, "maintainer_can_modify", nullable = false),
        stateState = json.decodeOptional(rawObject, "state", nullable = false),
        titleState = json.decodeOptional(rawObject, "title", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsPatchRequestJsonXb9c81491) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsPatchRequestJsonXb9c81491")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("base", value.baseState, json::encodeToJsonElement)
        putState("body", value.bodyState, json::encodeToJsonElement)
        putState("maintainer_can_modify", value.maintainerCanModifyState, json::encodeToJsonElement)
        putState("state", value.stateState, json::encodeToJsonElement)
        putState("title", value.titleState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsPatchRequestJsonXb9c81491(block: InlineReposPullsPatchRequestJsonXb9c81491.Builder.() -> Unit): InlineReposPullsPatchRequestJsonXb9c81491 = InlineReposPullsPatchRequestJsonXb9c81491.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposPullsPatchRequestJsonXb9c81491 property '" + name + "' is not nullable")
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
