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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1repository-access/patch/requestBody/content/applicatio
 * n~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1repository-access/patch/requestBody/content/applicatio
 * n~1json/schema
 */
@Serializable(with = InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a.Serializer::class)
public class InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a internal constructor(
  repositoryIdsToAddState: FieldState<List<Int>>,
  repositoryIdsToRemoveState: FieldState<List<Int>>,
) {
  private val repositoryIdsToAddState: FieldState<List<Int>> =
      repositoryIdsToAddState.copyValue { fieldValue -> fieldValue.toList() }

  private val repositoryIdsToRemoveState: FieldState<List<Int>> =
      repositoryIdsToRemoveState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * List of repository IDs to add.
   */
  public val repositoryIdsToAdd: List<Int>?
    get() = repositoryIdsToAddState.valueOrNull()

  /**
   * List of repository IDs to remove.
   */
  public val repositoryIdsToRemove: List<Int>?
    get() = repositoryIdsToRemoveState.valueOrNull()

  public constructor() : this(repositoryIdsToAddState = FieldState.Absent,
  repositoryIdsToRemoveState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `repository_ids_to_add`.
   */
  public fun repositoryIdsToAddPresence(): FieldPresence = repositoryIdsToAddState.presence

  /**
   * Returns the wire presence of `repository_ids_to_remove`.
   */
  public fun repositoryIdsToRemovePresence(): FieldPresence = repositoryIdsToRemoveState.presence

  public class Builder {
    private var repositoryIdsToAddState: FieldState<List<Int>> = FieldState.Absent

    /**
     * List of repository IDs to add.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var repositoryIdsToAdd: List<Int>?
      get() = repositoryIdsToAddState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "repositoryIdsToAdd is not nullable; call unsetRepositoryIdsToAdd() to omit it" }
        repositoryIdsToAddState = FieldState.Value(present.toList())
      }

    private var repositoryIdsToRemoveState: FieldState<List<Int>> = FieldState.Absent

    /**
     * List of repository IDs to remove.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var repositoryIdsToRemove: List<Int>?
      get() = repositoryIdsToRemoveState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "repositoryIdsToRemove is not nullable; call unsetRepositoryIdsToRemove() to omit it" }
        repositoryIdsToRemoveState = FieldState.Value(present.toList())
      }

    /**
     * Omits `repository_ids_to_add` from serialized output.
     */
    public fun unsetRepositoryIdsToAdd() {
      repositoryIdsToAddState = FieldState.Absent
    }

    /**
     * Omits `repository_ids_to_remove` from serialized output.
     */
    public fun unsetRepositoryIdsToRemove() {
      repositoryIdsToRemoveState = FieldState.Absent
    }

    public fun build(): InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a = InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a(
      repositoryIdsToAddState = repositoryIdsToAddState,
      repositoryIdsToRemoveState = repositoryIdsToRemoveState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a must be a JSON object")
      return InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a(
        repositoryIdsToAddState = json.decodeOptional(rawObject, "repository_ids_to_add", nullable = false),
        repositoryIdsToRemoveState = json.decodeOptional(rawObject, "repository_ids_to_remove", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("repository_ids_to_add", value.repositoryIdsToAddState, json::encodeToJsonElement)
        putState("repository_ids_to_remove", value.repositoryIdsToRemoveState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a(block: InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a.Builder.() -> Unit): InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a = InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a.build(block)

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
    if (!nullable) throw SerializationException("InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a property '" + name + "' is not nullable")
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
