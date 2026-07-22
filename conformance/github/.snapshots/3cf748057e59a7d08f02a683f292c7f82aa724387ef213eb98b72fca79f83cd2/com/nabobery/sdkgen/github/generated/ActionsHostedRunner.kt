package com.nabobery.sdkgen.github.generated

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
 * A Github-hosted hosted runner.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-hosted-runner
 */
@Serializable(with = ActionsHostedRunner.Serializer::class)
public class ActionsHostedRunner internal constructor(
  /**
   * The unique identifier of the hosted runner.
   */
  public val id: Int,
  public val imageDetails: NullableActionsHostedRunnerPoolImage?,
  public val machineSizeDetails: ActionsHostedRunnerMachineSpec,
  /**
   * The name of the hosted runner.
   */
  public val name: String,
  /**
   * The operating system of the image.
   */
  public val platform: String,
  /**
   * Whether public IP is enabled for the hosted runners.
   */
  public val publicIpEnabled: Boolean,
  /**
   * The status of the runner.
   */
  public val status: InlineActionsHostedRunnerStatusX66f56f87,
  private val imageGenState: FieldState<Boolean>,
  private val lastActiveOnState: FieldState<String?>,
  private val maximumRunnersState: FieldState<Int>,
  private val publicIpsState: FieldState<List<PublicIp>>,
  private val runnerGroupIdState: FieldState<Int>,
) {
  /**
   * Whether custom image generation is enabled for the hosted runners.
   */
  public val imageGen: Boolean?
    get() = imageGenState.valueOrNull()

  /**
   * The time at which the runner was last used, in ISO 8601 format.
   */
  public val lastActiveOn: String?
    get() = lastActiveOnState.valueOrNull()

  /**
   * The maximum amount of hosted runners. Runners will not scale automatically above this number. Use this setting to
   * limit your cost.
   */
  public val maximumRunners: Int?
    get() = maximumRunnersState.valueOrNull()

  /**
   * The public IP ranges when public IP is enabled for the hosted runners.
   */
  public val publicIps: List<PublicIp>?
    get() = publicIpsState.valueOrNull()

  /**
   * The unique identifier of the group that the hosted runner belongs to.
   */
  public val runnerGroupId: Int?
    get() = runnerGroupIdState.valueOrNull()

  public constructor(
    id: Int,
    imageDetails: NullableActionsHostedRunnerPoolImage?,
    machineSizeDetails: ActionsHostedRunnerMachineSpec,
    name: String,
    platform: String,
    publicIpEnabled: Boolean,
    status: InlineActionsHostedRunnerStatusX66f56f87,
  ) : this(id = id,
  imageDetails = imageDetails,
  machineSizeDetails = machineSizeDetails,
  name = name,
  platform = platform,
  publicIpEnabled = publicIpEnabled,
  status = status,
  imageGenState = FieldState.Absent,
  lastActiveOnState = FieldState.Absent,
  maximumRunnersState = FieldState.Absent,
  publicIpsState = FieldState.Absent,
  runnerGroupIdState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `image_gen`.
   */
  public fun imageGenPresence(): FieldPresence = imageGenState.presence

  /**
   * Returns the wire presence of `last_active_on`.
   */
  public fun lastActiveOnPresence(): FieldPresence = lastActiveOnState.presence

  /**
   * Returns the wire presence of `maximum_runners`.
   */
  public fun maximumRunnersPresence(): FieldPresence = maximumRunnersState.presence

  /**
   * Returns the wire presence of `public_ips`.
   */
  public fun publicIpsPresence(): FieldPresence = publicIpsState.presence

  /**
   * Returns the wire presence of `runner_group_id`.
   */
  public fun runnerGroupIdPresence(): FieldPresence = runnerGroupIdState.presence

  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var machineSizeDetailsValue: ActionsHostedRunnerMachineSpec? = null

    public var machineSizeDetails: ActionsHostedRunnerMachineSpec
      get() = requireNotNull(machineSizeDetailsValue) { "machineSizeDetails is required" }
      set(`value`) {
        machineSizeDetailsValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var platformValue: String? = null

    public var platform: String
      get() = requireNotNull(platformValue) { "platform is required" }
      set(`value`) {
        platformValue = value
      }

    private var publicIpEnabledValue: Boolean? = null

    public var publicIpEnabled: Boolean
      get() = requireNotNull(publicIpEnabledValue) { "publicIpEnabled is required" }
      set(`value`) {
        publicIpEnabledValue = value
      }

    private var statusValue: InlineActionsHostedRunnerStatusX66f56f87? = null

    public var status: InlineActionsHostedRunnerStatusX66f56f87
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var imageDetailsState: FieldState<NullableActionsHostedRunnerPoolImage?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var imageDetails: NullableActionsHostedRunnerPoolImage?
      get() = imageDetailsState.valueOrNull()
      set(`value`) {
        imageDetailsState = value.toNullableFieldState()
      }

    private var imageGenState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether custom image generation is enabled for the hosted runners.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var imageGen: Boolean?
      get() = imageGenState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "imageGen is not nullable; call unsetImageGen() to omit it" }
        imageGenState = FieldState.Value(present)
      }

    private var lastActiveOnState: FieldState<String?> = FieldState.Absent

    /**
     * The time at which the runner was last used, in ISO 8601 format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var lastActiveOn: String?
      get() = lastActiveOnState.valueOrNull()
      set(`value`) {
        lastActiveOnState = value.toNullableFieldState()
      }

    private var maximumRunnersState: FieldState<Int> = FieldState.Absent

    /**
     * The maximum amount of hosted runners. Runners will not scale automatically above this number. Use this setting to
     * limit your cost.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var maximumRunners: Int?
      get() = maximumRunnersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "maximumRunners is not nullable; call unsetMaximumRunners() to omit it" }
        maximumRunnersState = FieldState.Value(present)
      }

    private var publicIpsState: FieldState<List<PublicIp>> = FieldState.Absent

    /**
     * The public IP ranges when public IP is enabled for the hosted runners.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var publicIps: List<PublicIp>?
      get() = publicIpsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "publicIps is not nullable; call unsetPublicIps() to omit it" }
        publicIpsState = FieldState.Value(present)
      }

    private var runnerGroupIdState: FieldState<Int> = FieldState.Absent

    /**
     * The unique identifier of the group that the hosted runner belongs to.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var runnerGroupId: Int?
      get() = runnerGroupIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "runnerGroupId is not nullable; call unsetRunnerGroupId() to omit it" }
        runnerGroupIdState = FieldState.Value(present)
      }

    /**
     * Omits `image_gen` from serialized output.
     */
    public fun unsetImageGen() {
      imageGenState = FieldState.Absent
    }

    /**
     * Omits `last_active_on` from serialized output.
     */
    public fun unsetLastActiveOn() {
      lastActiveOnState = FieldState.Absent
    }

    /**
     * Omits `maximum_runners` from serialized output.
     */
    public fun unsetMaximumRunners() {
      maximumRunnersState = FieldState.Absent
    }

    /**
     * Omits `public_ips` from serialized output.
     */
    public fun unsetPublicIps() {
      publicIpsState = FieldState.Absent
    }

    /**
     * Omits `runner_group_id` from serialized output.
     */
    public fun unsetRunnerGroupId() {
      runnerGroupIdState = FieldState.Absent
    }

    public fun build(): ActionsHostedRunner {
      check(idValue != null) { "id is required" }
      check(machineSizeDetailsValue != null) { "machineSizeDetails is required" }
      check(nameValue != null) { "name is required" }
      check(platformValue != null) { "platform is required" }
      check(publicIpEnabledValue != null) { "publicIpEnabled is required" }
      check(statusValue != null) { "status is required" }
      check(imageDetailsState !== FieldState.Absent) { "imageDetails is required, even when null" }
      return ActionsHostedRunner(
        id = id,
        imageDetails = imageDetailsState.valueOrNull(),
        machineSizeDetails = machineSizeDetails,
        name = name,
        platform = platform,
        publicIpEnabled = publicIpEnabled,
        status = status,
        imageGenState = imageGenState,
        lastActiveOnState = lastActiveOnState,
        maximumRunnersState = maximumRunnersState,
        publicIpsState = publicIpsState,
        runnerGroupIdState = runnerGroupIdState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsHostedRunner = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActionsHostedRunner> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsHostedRunner {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsHostedRunner")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsHostedRunner must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val machineSizeDetails = json.decodeRequired<ActionsHostedRunnerMachineSpec>(rawObject, "machine_size_details")
      val name = json.decodeRequired<String>(rawObject, "name")
      val platform = json.decodeRequired<String>(rawObject, "platform")
      val publicIpEnabled = json.decodeRequired<Boolean>(rawObject, "public_ip_enabled")
      val status = json.decodeRequired<InlineActionsHostedRunnerStatusX66f56f87>(rawObject, "status")
      if (!rawObject.containsKey("image_details")) {
        throw SerializationException("ActionsHostedRunner is missing required property 'image_details'")
      }
      val imageDetails = rawObject["image_details"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableActionsHostedRunnerPoolImage?>(requireNotNull(element)) }
      return ActionsHostedRunner(
        id = id,
        imageDetails = imageDetails,
        machineSizeDetails = machineSizeDetails,
        name = name,
        platform = platform,
        publicIpEnabled = publicIpEnabled,
        status = status,
        imageGenState = json.decodeOptional(rawObject, "image_gen", nullable = false),
        lastActiveOnState = json.decodeOptional(rawObject, "last_active_on", nullable = true),
        maximumRunnersState = json.decodeOptional(rawObject, "maximum_runners", nullable = false),
        publicIpsState = json.decodeOptional(rawObject, "public_ips", nullable = false),
        runnerGroupIdState = json.decodeOptional(rawObject, "runner_group_id", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsHostedRunner) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsHostedRunner")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("image_details", value.imageDetails?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("machine_size_details", json.encodeToJsonElement(value.machineSizeDetails))
        put("name", value.name)
        put("platform", value.platform)
        put("public_ip_enabled", json.encodeToJsonElement(value.publicIpEnabled))
        put("status", json.encodeToJsonElement(value.status))
        putState("image_gen", value.imageGenState, json::encodeToJsonElement)
        putState("last_active_on", value.lastActiveOnState, json::encodeToJsonElement)
        putState("maximum_runners", value.maximumRunnersState, json::encodeToJsonElement)
        putState("public_ips", value.publicIpsState, json::encodeToJsonElement)
        putState("runner_group_id", value.runnerGroupIdState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsHostedRunner(block: ActionsHostedRunner.Builder.() -> Unit): ActionsHostedRunner = ActionsHostedRunner.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsHostedRunner is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ActionsHostedRunner property '" + name + "' is not nullable")
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
