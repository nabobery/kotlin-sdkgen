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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/nullable-scoped-installation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-scoped-installation
 */
@Serializable(with = NullableScopedInstallation.Serializer::class)
public class NullableScopedInstallation internal constructor(
  public val account: SimpleUser,
  public val permissions: AppPermissions,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoriesUrl: String,
  /**
   * Describe whether all repositories have been selected or there's a selection involved
   */
  public val repositorySelection: InlineNullableScopedInstallationRepositorySelectionX6eb78fa0,
  public val singleFileName: String?,
  private val hasMultipleSingleFilesState: FieldState<Boolean>,
  singleFilePathsState: FieldState<List<String>>,
) {
  private val singleFilePathsState: FieldState<List<String>> =
      singleFilePathsState.copyValue { fieldValue -> fieldValue.toList() }

  public val hasMultipleSingleFiles: Boolean?
    get() = hasMultipleSingleFilesState.valueOrNull()

  public val singleFilePaths: List<String>?
    get() = singleFilePathsState.valueOrNull()

  public constructor(
    account: SimpleUser,
    permissions: AppPermissions,
    repositoriesUrl: String,
    repositorySelection: InlineNullableScopedInstallationRepositorySelectionX6eb78fa0,
    singleFileName: String?,
  ) : this(account = account,
  permissions = permissions,
  repositoriesUrl = repositoriesUrl,
  repositorySelection = repositorySelection,
  singleFileName = singleFileName,
  hasMultipleSingleFilesState = FieldState.Absent,
  singleFilePathsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `has_multiple_single_files`.
   */
  public fun hasMultipleSingleFilesPresence(): FieldPresence = hasMultipleSingleFilesState.presence

  /**
   * Returns the wire presence of `single_file_paths`.
   */
  public fun singleFilePathsPresence(): FieldPresence = singleFilePathsState.presence

  public class Builder {
    private var accountValue: SimpleUser? = null

    public var account: SimpleUser
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    private var permissionsValue: AppPermissions? = null

    public var permissions: AppPermissions
      get() = requireNotNull(permissionsValue) { "permissions is required" }
      set(`value`) {
        permissionsValue = value
      }

    private var repositoriesUrlValue: String? = null

    public var repositoriesUrl: String
      get() = requireNotNull(repositoriesUrlValue) { "repositoriesUrl is required" }
      set(`value`) {
        repositoriesUrlValue = value
      }

    private var repositorySelectionValue:
        InlineNullableScopedInstallationRepositorySelectionX6eb78fa0? = null

    public var repositorySelection: InlineNullableScopedInstallationRepositorySelectionX6eb78fa0
      get() = requireNotNull(repositorySelectionValue) { "repositorySelection is required" }
      set(`value`) {
        repositorySelectionValue = value
      }

    private var singleFileNameState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var singleFileName: String?
      get() = singleFileNameState.valueOrNull()
      set(`value`) {
        singleFileNameState = value.toNullableFieldState()
      }

    private var hasMultipleSingleFilesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasMultipleSingleFiles: Boolean?
      get() = hasMultipleSingleFilesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasMultipleSingleFiles is not nullable; call unsetHasMultipleSingleFiles() to omit it" }
        hasMultipleSingleFilesState = FieldState.Value(present)
      }

    private var singleFilePathsState: FieldState<List<String>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var singleFilePaths: List<String>?
      get() = singleFilePathsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "singleFilePaths is not nullable; call unsetSingleFilePaths() to omit it" }
        singleFilePathsState = FieldState.Value(present.toList())
      }

    /**
     * Omits `has_multiple_single_files` from serialized output.
     */
    public fun unsetHasMultipleSingleFiles() {
      hasMultipleSingleFilesState = FieldState.Absent
    }

    /**
     * Omits `single_file_paths` from serialized output.
     */
    public fun unsetSingleFilePaths() {
      singleFilePathsState = FieldState.Absent
    }

    public fun build(): NullableScopedInstallation {
      check(accountValue != null) { "account is required" }
      check(permissionsValue != null) { "permissions is required" }
      check(repositoriesUrlValue != null) { "repositoriesUrl is required" }
      check(repositorySelectionValue != null) { "repositorySelection is required" }
      check(singleFileNameState !== FieldState.Absent) { "singleFileName is required, even when null" }
      return NullableScopedInstallation(
        account = account,
        permissions = permissions,
        repositoriesUrl = repositoriesUrl,
        repositorySelection = repositorySelection,
        singleFileName = singleFileNameState.valueOrNull(),
        hasMultipleSingleFilesState = hasMultipleSingleFilesState,
        singleFilePathsState = singleFilePathsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NullableScopedInstallation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<NullableScopedInstallation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NullableScopedInstallation {
      val jsonDecoder = decoder.requireJsonDecoder("NullableScopedInstallation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NullableScopedInstallation must be a JSON object")
      val account = json.decodeRequired<SimpleUser>(rawObject, "account")
      val permissions = json.decodeRequired<AppPermissions>(rawObject, "permissions")
      val repositoriesUrl = json.decodeRequired<String>(rawObject, "repositories_url")
      val repositorySelection = json.decodeRequired<InlineNullableScopedInstallationRepositorySelectionX6eb78fa0>(rawObject, "repository_selection")
      if (!rawObject.containsKey("single_file_name")) {
        throw SerializationException("NullableScopedInstallation is missing required property 'single_file_name'")
      }
      val singleFileName = rawObject["single_file_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return NullableScopedInstallation(
        account = account,
        permissions = permissions,
        repositoriesUrl = repositoriesUrl,
        repositorySelection = repositorySelection,
        singleFileName = singleFileName,
        hasMultipleSingleFilesState = json.decodeOptional(rawObject, "has_multiple_single_files", nullable = false),
        singleFilePathsState = json.decodeOptional(rawObject, "single_file_paths", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: NullableScopedInstallation) {
      val jsonEncoder = encoder.requireJsonEncoder("NullableScopedInstallation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", json.encodeToJsonElement(value.account))
        put("permissions", json.encodeToJsonElement(value.permissions))
        put("repositories_url", value.repositoriesUrl)
        put("repository_selection", json.encodeToJsonElement(value.repositorySelection))
        put("single_file_name", value.singleFileName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("has_multiple_single_files", value.hasMultipleSingleFilesState, json::encodeToJsonElement)
        putState("single_file_paths", value.singleFilePathsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun nullableScopedInstallation(block: NullableScopedInstallation.Builder.() -> Unit): NullableScopedInstallation = NullableScopedInstallation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NullableScopedInstallation is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("NullableScopedInstallation property '" + name + "' is not nullable")
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
