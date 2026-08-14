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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1{hosted_runner_id}/patch/requestBody/cont
 * ent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners~1{hosted_runner_id}/patch/requestBody/cont
 * ent/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a.Serializer::class)
public class InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a internal constructor(
  private val enableStaticIpState: FieldState<Boolean>,
  private val imageGenState: FieldState<Boolean>,
  private val imageIdState: FieldState<String>,
  private val imageSourceState:
      FieldState<InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4>,
  private val imageVersionState: FieldState<String?>,
  private val maximumRunnersState: FieldState<Int>,
  private val nameState: FieldState<String>,
  private val runnerGroupIdState: FieldState<Int>,
  private val sizeState: FieldState<String>,
) {
  /**
   * Whether this runner should be updated with a static public IP. Note limit on account. To list limits on account,
   * use `GET actions/hosted-runners/limits`
   */
  public val enableStaticIp: Boolean?
    get() = enableStaticIpState.valueOrNull()

  /**
   * Whether to enable image generation for this runner pool. When enabled, the runner pool is used to build and publish
   * custom runner images.
   */
  public val imageGen: Boolean?
    get() = imageGenState.valueOrNull()

  /**
   * The unique identifier of the runner image. To list available images, use `GET
   * /actions/hosted-runners/images/github-owned`, `GET /actions/hosted-runners/images/partner`, or `GET
   * /actions/hosted-runners/images/custom`.
   */
  public val imageId: String?
    get() = imageIdState.valueOrNull()

  /**
   * The source type of the runner image to use. Must match the source of the image specified by `image_id`. Can be one
   * of `github`, `partner`, or `custom`.
   */
  public val imageSource: InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4?
    get() = imageSourceState.valueOrNull()

  /**
   * The version of the runner image to deploy. This is relevant only for runners using custom images.
   */
  public val imageVersion: String?
    get() = imageVersionState.valueOrNull()

  /**
   * The maximum amount of runners to scale up to. Runners will not auto-scale above this number. Use this setting to
   * limit your cost.
   */
  public val maximumRunners: Int?
    get() = maximumRunnersState.valueOrNull()

  /**
   * Name of the runner. Must be between 1 and 64 characters and may only contain upper and lowercase letters a-z,
   * numbers 0-9, '.', '-', and '_'.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * The existing runner group to add this runner to.
   */
  public val runnerGroupId: Int?
    get() = runnerGroupIdState.valueOrNull()

  /**
   * The machine size of the runner. To list available sizes, use `GET actions/hosted-runners/machine-sizes`
   */
  public val size: String?
    get() = sizeState.valueOrNull()

  public constructor() : this(enableStaticIpState = FieldState.Absent,
  imageGenState = FieldState.Absent,
  imageIdState = FieldState.Absent,
  imageSourceState = FieldState.Absent,
  imageVersionState = FieldState.Absent,
  maximumRunnersState = FieldState.Absent,
  nameState = FieldState.Absent,
  runnerGroupIdState = FieldState.Absent,
  sizeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `enable_static_ip`.
   */
  public fun enableStaticIpPresence(): FieldPresence = enableStaticIpState.presence

  /**
   * Returns the wire presence of `image_gen`.
   */
  public fun imageGenPresence(): FieldPresence = imageGenState.presence

  /**
   * Returns the wire presence of `image_id`.
   */
  public fun imageIdPresence(): FieldPresence = imageIdState.presence

  /**
   * Returns the wire presence of `image_source`.
   */
  public fun imageSourcePresence(): FieldPresence = imageSourceState.presence

  /**
   * Returns the wire presence of `image_version`.
   */
  public fun imageVersionPresence(): FieldPresence = imageVersionState.presence

  /**
   * Returns the wire presence of `maximum_runners`.
   */
  public fun maximumRunnersPresence(): FieldPresence = maximumRunnersState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `runner_group_id`.
   */
  public fun runnerGroupIdPresence(): FieldPresence = runnerGroupIdState.presence

  /**
   * Returns the wire presence of `size`.
   */
  public fun sizePresence(): FieldPresence = sizeState.presence

  public class Builder {
    private var enableStaticIpState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether this runner should be updated with a static public IP. Note limit on account. To list limits on account,
     * use `GET actions/hosted-runners/limits`
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enableStaticIp: Boolean?
      get() = enableStaticIpState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "enableStaticIp is not nullable; call unsetEnableStaticIp() to omit it" }
        enableStaticIpState = FieldState.Value(present)
      }

    private var imageGenState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether to enable image generation for this runner pool. When enabled, the runner pool is used to build and
     * publish custom runner images.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var imageGen: Boolean?
      get() = imageGenState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "imageGen is not nullable; call unsetImageGen() to omit it" }
        imageGenState = FieldState.Value(present)
      }

    private var imageIdState: FieldState<String> = FieldState.Absent

    /**
     * The unique identifier of the runner image. To list available images, use `GET
     * /actions/hosted-runners/images/github-owned`, `GET /actions/hosted-runners/images/partner`, or `GET
     * /actions/hosted-runners/images/custom`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var imageId: String?
      get() = imageIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "imageId is not nullable; call unsetImageId() to omit it" }
        imageIdState = FieldState.Value(present)
      }

    private var imageSourceState:
        FieldState<InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4> =
        FieldState.Absent

    /**
     * The source type of the runner image to use. Must match the source of the image specified by `image_id`. Can be
     * one of `github`, `partner`, or `custom`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var imageSource: InlineOrgsActionsHostedRunnersPatchRequestJsonImageSourceX0f9413f4?
      get() = imageSourceState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "imageSource is not nullable; call unsetImageSource() to omit it" }
        imageSourceState = FieldState.Value(present)
      }

    private var imageVersionState: FieldState<String?> = FieldState.Absent

    /**
     * The version of the runner image to deploy. This is relevant only for runners using custom images.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var imageVersion: String?
      get() = imageVersionState.valueOrNull()
      set(`value`) {
        imageVersionState = value.toNullableFieldState()
      }

    private var maximumRunnersState: FieldState<Int> = FieldState.Absent

    /**
     * The maximum amount of runners to scale up to. Runners will not auto-scale above this number. Use this setting to
     * limit your cost.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var maximumRunners: Int?
      get() = maximumRunnersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "maximumRunners is not nullable; call unsetMaximumRunners() to omit it" }
        maximumRunnersState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * Name of the runner. Must be between 1 and 64 characters and may only contain upper and lowercase letters a-z,
     * numbers 0-9, '.', '-', and '_'.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var runnerGroupIdState: FieldState<Int> = FieldState.Absent

    /**
     * The existing runner group to add this runner to.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var runnerGroupId: Int?
      get() = runnerGroupIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "runnerGroupId is not nullable; call unsetRunnerGroupId() to omit it" }
        runnerGroupIdState = FieldState.Value(present)
      }

    private var sizeState: FieldState<String> = FieldState.Absent

    /**
     * The machine size of the runner. To list available sizes, use `GET actions/hosted-runners/machine-sizes`
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var size: String?
      get() = sizeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "size is not nullable; call unsetSize() to omit it" }
        sizeState = FieldState.Value(present)
      }

    /**
     * Omits `enable_static_ip` from serialized output.
     */
    public fun unsetEnableStaticIp() {
      enableStaticIpState = FieldState.Absent
    }

    /**
     * Omits `image_gen` from serialized output.
     */
    public fun unsetImageGen() {
      imageGenState = FieldState.Absent
    }

    /**
     * Omits `image_id` from serialized output.
     */
    public fun unsetImageId() {
      imageIdState = FieldState.Absent
    }

    /**
     * Omits `image_source` from serialized output.
     */
    public fun unsetImageSource() {
      imageSourceState = FieldState.Absent
    }

    /**
     * Omits `image_version` from serialized output.
     */
    public fun unsetImageVersion() {
      imageVersionState = FieldState.Absent
    }

    /**
     * Omits `maximum_runners` from serialized output.
     */
    public fun unsetMaximumRunners() {
      maximumRunnersState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `runner_group_id` from serialized output.
     */
    public fun unsetRunnerGroupId() {
      runnerGroupIdState = FieldState.Absent
    }

    /**
     * Omits `size` from serialized output.
     */
    public fun unsetSize() {
      sizeState = FieldState.Absent
    }

    public fun build(): InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a = InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a(
      enableStaticIpState = enableStaticIpState,
      imageGenState = imageGenState,
      imageIdState = imageIdState,
      imageSourceState = imageSourceState,
      imageVersionState = imageVersionState,
      maximumRunnersState = maximumRunnersState,
      nameState = nameState,
      runnerGroupIdState = runnerGroupIdState,
      sizeState = sizeState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a must be a JSON object")
      return InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a(
        enableStaticIpState = json.decodeOptional(rawObject, "enable_static_ip", nullable = false),
        imageGenState = json.decodeOptional(rawObject, "image_gen", nullable = false),
        imageIdState = json.decodeOptional(rawObject, "image_id", nullable = false),
        imageSourceState = json.decodeOptional(rawObject, "image_source", nullable = false),
        imageVersionState = json.decodeOptional(rawObject, "image_version", nullable = true),
        maximumRunnersState = json.decodeOptional(rawObject, "maximum_runners", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        runnerGroupIdState = json.decodeOptional(rawObject, "runner_group_id", nullable = false),
        sizeState = json.decodeOptional(rawObject, "size", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("enable_static_ip", value.enableStaticIpState, json::encodeToJsonElement)
        putState("image_gen", value.imageGenState, json::encodeToJsonElement)
        putState("image_id", value.imageIdState, json::encodeToJsonElement)
        putState("image_source", value.imageSourceState, json::encodeToJsonElement)
        putState("image_version", value.imageVersionState, json::encodeToJsonElement)
        putState("maximum_runners", value.maximumRunnersState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("runner_group_id", value.runnerGroupIdState, json::encodeToJsonElement)
        putState("size", value.sizeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a(block: InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a.Builder.() -> Unit): InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a = InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrgsActionsHostedRunnersPatchRequestJsonX503ee98a property '" + name + "' is not nullable")
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
