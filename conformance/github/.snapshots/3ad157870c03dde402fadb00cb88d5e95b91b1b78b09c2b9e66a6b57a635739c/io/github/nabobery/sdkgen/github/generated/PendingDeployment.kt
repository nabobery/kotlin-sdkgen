package io.github.nabobery.sdkgen.github.generated

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
 * Details of a deployment that is waiting for protection rules to pass
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pending-deployment
 */
@Serializable(with = PendingDeployment.Serializer::class)
public class PendingDeployment(
  /**
   * Whether the currently authenticated user can approve the deployment
   */
  public val currentUserCanApprove: Boolean,
  public val environment: InlinePendingDeploymentEnvironmentX86f49901,
  reviewers: List<InlinePendingDeploymentReviewersItemXdec4be0a>,
  /**
   * The set duration of the wait timer
   */
  public val waitTimer: Int,
  /**
   * The time that the wait timer began.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val waitTimerStartedAt: String?,
) {
  /**
   * The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as
   * reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs
   * to approve the job for it to proceed.
   */
  public val reviewers: List<InlinePendingDeploymentReviewersItemXdec4be0a> = reviewers.toList()

  public class Builder {
    private var currentUserCanApproveValue: Boolean? = null

    public var currentUserCanApprove: Boolean
      get() = requireNotNull(currentUserCanApproveValue) { "currentUserCanApprove is required" }
      set(`value`) {
        currentUserCanApproveValue = value
      }

    private var environmentValue: InlinePendingDeploymentEnvironmentX86f49901? = null

    public var environment: InlinePendingDeploymentEnvironmentX86f49901
      get() = requireNotNull(environmentValue) { "environment is required" }
      set(`value`) {
        environmentValue = value
      }

    private var reviewersValue: List<InlinePendingDeploymentReviewersItemXdec4be0a>? = null

    public var reviewers: List<InlinePendingDeploymentReviewersItemXdec4be0a>
      get() = requireNotNull(reviewersValue) { "reviewers is required" }.toList()
      set(`value`) {
        reviewersValue = value.toList()
      }

    private var waitTimerValue: Int? = null

    public var waitTimer: Int
      get() = requireNotNull(waitTimerValue) { "waitTimer is required" }
      set(`value`) {
        waitTimerValue = value
      }

    private var waitTimerStartedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The time that the wait timer began.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var waitTimerStartedAt: String?
      get() = waitTimerStartedAtState.valueOrNull()
      set(`value`) {
        waitTimerStartedAtState = value.toNullableFieldState()
      }

    public fun build(): PendingDeployment {
      check(currentUserCanApproveValue != null) { "currentUserCanApprove is required" }
      check(environmentValue != null) { "environment is required" }
      check(reviewersValue != null) { "reviewers is required" }
      check(waitTimerValue != null) { "waitTimer is required" }
      check(waitTimerStartedAtState !== FieldState.Absent) { "waitTimerStartedAt is required, even when null" }
      return PendingDeployment(
        currentUserCanApprove = currentUserCanApprove,
        environment = environment,
        reviewers = reviewers,
        waitTimer = waitTimer,
        waitTimerStartedAt = waitTimerStartedAtState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PendingDeployment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PendingDeployment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PendingDeployment {
      val jsonDecoder = decoder.requireJsonDecoder("PendingDeployment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PendingDeployment must be a JSON object")
      val currentUserCanApprove = json.decodeRequired<Boolean>(rawObject, "current_user_can_approve")
      val environment = json.decodeRequired<InlinePendingDeploymentEnvironmentX86f49901>(rawObject, "environment")
      val reviewers = json.decodeRequired<List<InlinePendingDeploymentReviewersItemXdec4be0a>>(rawObject, "reviewers")
      val waitTimer = json.decodeRequired<Int>(rawObject, "wait_timer")
      if (!rawObject.containsKey("wait_timer_started_at")) {
        throw SerializationException("PendingDeployment is missing required property 'wait_timer_started_at'")
      }
      val waitTimerStartedAt = rawObject["wait_timer_started_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return PendingDeployment(
        currentUserCanApprove = currentUserCanApprove,
        environment = environment,
        reviewers = reviewers,
        waitTimer = waitTimer,
        waitTimerStartedAt = waitTimerStartedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PendingDeployment) {
      val jsonEncoder = encoder.requireJsonEncoder("PendingDeployment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("current_user_can_approve", json.encodeToJsonElement(value.currentUserCanApprove))
        put("environment", json.encodeToJsonElement(value.environment))
        put("reviewers", json.encodeToJsonElement(value.reviewers))
        put("wait_timer", json.encodeToJsonElement(value.waitTimer))
        put("wait_timer_started_at", value.waitTimerStartedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pendingDeployment(block: PendingDeployment.Builder.() -> Unit): PendingDeployment = PendingDeployment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PendingDeployment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("PendingDeployment property '" + name + "' is not nullable")
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
