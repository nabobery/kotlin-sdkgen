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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1required_status_checks/
 * patch/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1required_status_checks/
 * patch/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8.Serializer::class)
public class InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8 internal constructor(
  checksState: FieldState<List<InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00>>,
  contextsState: FieldState<List<String>>,
  private val strictState: FieldState<Boolean>,
) {
  private val checksState:
      FieldState<List<InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00>> =
      checksState.copyValue { fieldValue -> fieldValue.toList() }

  private val contextsState: FieldState<List<String>> =
      contextsState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * The list of status checks to require in order to merge into this branch.
   */
  public val checks: List<InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00>?
    get() = checksState.valueOrNull()

  /**
   * **Closing down notice**: The list of status checks to require in order to merge into this branch. If any of these
   * checks have recently been set by a particular GitHub App, they will be required to come from that app in future for
   * the branch to merge. Use `checks` instead of `contexts` for more fine-grained control.
   */
  public val contexts: List<String>?
    get() = contextsState.valueOrNull()

  /**
   * Require branches to be up to date before merging.
   */
  public val strict: Boolean?
    get() = strictState.valueOrNull()

  public constructor() : this(checksState = FieldState.Absent,
  contextsState = FieldState.Absent,
  strictState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `checks`.
   */
  public fun checksPresence(): FieldPresence = checksState.presence

  /**
   * Returns the wire presence of `contexts`.
   */
  public fun contextsPresence(): FieldPresence = contextsState.presence

  /**
   * Returns the wire presence of `strict`.
   */
  public fun strictPresence(): FieldPresence = strictState.presence

  public class Builder {
    private var checksState:
        FieldState<List<InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00>> =
        FieldState.Absent

    /**
     * The list of status checks to require in order to merge into this branch.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var checks: List<InlineReposBranchesProtectb602PatchRequestJsonChecksItemXb0d84f00>?
      get() = checksState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "checks is not nullable; call unsetChecks() to omit it" }
        checksState = FieldState.Value(present.toList())
      }

    private var contextsState: FieldState<List<String>> = FieldState.Absent

    /**
     * **Closing down notice**: The list of status checks to require in order to merge into this branch. If any of these
     * checks have recently been set by a particular GitHub App, they will be required to come from that app in future
     * for the branch to merge. Use `checks` instead of `contexts` for more fine-grained control.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var contexts: List<String>?
      get() = contextsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "contexts is not nullable; call unsetContexts() to omit it" }
        contextsState = FieldState.Value(present.toList())
      }

    private var strictState: FieldState<Boolean> = FieldState.Absent

    /**
     * Require branches to be up to date before merging.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var strict: Boolean?
      get() = strictState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "strict is not nullable; call unsetStrict() to omit it" }
        strictState = FieldState.Value(present)
      }

    /**
     * Omits `checks` from serialized output.
     */
    public fun unsetChecks() {
      checksState = FieldState.Absent
    }

    /**
     * Omits `contexts` from serialized output.
     */
    public fun unsetContexts() {
      contextsState = FieldState.Absent
    }

    /**
     * Omits `strict` from serialized output.
     */
    public fun unsetStrict() {
      strictState = FieldState.Absent
    }

    public fun build(): InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8 = InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8(
      checksState = checksState,
      contextsState = contextsState,
      strictState = strictState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8 must be a JSON object")
      return InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8(
        checksState = json.decodeOptional(rawObject, "checks", nullable = false),
        contextsState = json.decodeOptional(rawObject, "contexts", nullable = false),
        strictState = json.decodeOptional(rawObject, "strict", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("checks", value.checksState, json::encodeToJsonElement)
        putState("contexts", value.contextsState, json::encodeToJsonElement)
        putState("strict", value.strictState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8(block: InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8.Builder.() -> Unit): InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8 = InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8.build(block)

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
    if (!nullable) throw SerializationException("InlineReposBranchesProtectionRequiredStatusChecksPatchRequestJsonXd519c2f8 property '" + name + "' is not nullable")
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
