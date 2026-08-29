package com.nabobery.sdkgen.github.generated

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
 * An artifact
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/artifact
 */
@Serializable(with = Artifact.Serializer::class)
public class Artifact internal constructor(
  public val archiveDownloadUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String?,
  /**
   * Whether or not the artifact has expired.
   */
  public val expired: Boolean,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val expiresAt: String?,
  public val id: Int,
  /**
   * The name of the artifact.
   */
  public val name: String,
  public val nodeId: String,
  /**
   * The size in bytes of the artifact.
   */
  public val sizeInBytes: Int,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?,
  public val url: String,
  private val digestState: FieldState<String?>,
  private val workflowRunState: FieldState<InlineArtifactWorkflowRunX6b4b28de?>,
) {
  /**
   * The SHA256 digest of the artifact. This field will only be populated on artifacts uploaded with upload-artifact v4
   * or newer. For older versions, this field will be null.
   */
  public val digest: String?
    get() = digestState.valueOrNull()

  public val workflowRun: InlineArtifactWorkflowRunX6b4b28de?
    get() = workflowRunState.valueOrNull()

  public constructor(
    archiveDownloadUrl: String,
    createdAt: String?,
    expired: Boolean,
    expiresAt: String?,
    id: Int,
    name: String,
    nodeId: String,
    sizeInBytes: Int,
    updatedAt: String?,
    url: String,
  ) : this(archiveDownloadUrl = archiveDownloadUrl,
  createdAt = createdAt,
  expired = expired,
  expiresAt = expiresAt,
  id = id,
  name = name,
  nodeId = nodeId,
  sizeInBytes = sizeInBytes,
  updatedAt = updatedAt,
  url = url,
  digestState = FieldState.Absent,
  workflowRunState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `digest`.
   */
  public fun digestPresence(): FieldPresence = digestState.presence

  /**
   * Returns the wire presence of `workflow_run`.
   */
  public fun workflowRunPresence(): FieldPresence = workflowRunState.presence

  public class Builder {
    private var archiveDownloadUrlValue: String? = null

    public var archiveDownloadUrl: String
      get() = requireNotNull(archiveDownloadUrlValue) { "archiveDownloadUrl is required" }
      set(`value`) {
        archiveDownloadUrlValue = value
      }

    private var expiredValue: Boolean? = null

    public var expired: Boolean
      get() = requireNotNull(expiredValue) { "expired is required" }
      set(`value`) {
        expiredValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var sizeInBytesValue: Int? = null

    public var sizeInBytes: Int
      get() = requireNotNull(sizeInBytesValue) { "sizeInBytes is required" }
      set(`value`) {
        sizeInBytesValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var createdAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        createdAtState = value.toNullableFieldState()
      }

    private var expiresAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var expiresAt: String?
      get() = expiresAtState.valueOrNull()
      set(`value`) {
        expiresAtState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    private var digestState: FieldState<String?> = FieldState.Absent

    /**
     * The SHA256 digest of the artifact. This field will only be populated on artifacts uploaded with upload-artifact
     * v4 or newer. For older versions, this field will be null.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var digest: String?
      get() = digestState.valueOrNull()
      set(`value`) {
        digestState = value.toNullableFieldState()
      }

    private var workflowRunState: FieldState<InlineArtifactWorkflowRunX6b4b28de?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var workflowRun: InlineArtifactWorkflowRunX6b4b28de?
      get() = workflowRunState.valueOrNull()
      set(`value`) {
        workflowRunState = value.toNullableFieldState()
      }

    /**
     * Omits `digest` from serialized output.
     */
    public fun unsetDigest() {
      digestState = FieldState.Absent
    }

    /**
     * Omits `workflow_run` from serialized output.
     */
    public fun unsetWorkflowRun() {
      workflowRunState = FieldState.Absent
    }

    public fun build(): Artifact {
      check(archiveDownloadUrlValue != null) { "archiveDownloadUrl is required" }
      check(expiredValue != null) { "expired is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(sizeInBytesValue != null) { "sizeInBytes is required" }
      check(urlValue != null) { "url is required" }
      check(createdAtState !== FieldState.Absent) { "createdAt is required, even when null" }
      check(expiresAtState !== FieldState.Absent) { "expiresAt is required, even when null" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      return Artifact(
        archiveDownloadUrl = archiveDownloadUrl,
        createdAt = createdAtState.valueOrNull(),
        expired = expired,
        expiresAt = expiresAtState.valueOrNull(),
        id = id,
        name = name,
        nodeId = nodeId,
        sizeInBytes = sizeInBytes,
        updatedAt = updatedAtState.valueOrNull(),
        url = url,
        digestState = digestState,
        workflowRunState = workflowRunState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Artifact = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Artifact> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Artifact {
      val jsonDecoder = decoder.requireJsonDecoder("Artifact")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Artifact must be a JSON object")
      val archiveDownloadUrl = json.decodeRequired<String>(rawObject, "archive_download_url")
      val expired = json.decodeRequired<Boolean>(rawObject, "expired")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val sizeInBytes = json.decodeRequired<Int>(rawObject, "size_in_bytes")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("created_at")) {
        throw SerializationException("Artifact is missing required property 'created_at'")
      }
      val createdAt = rawObject["created_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("expires_at")) {
        throw SerializationException("Artifact is missing required property 'expires_at'")
      }
      val expiresAt = rawObject["expires_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("updated_at")) {
        throw SerializationException("Artifact is missing required property 'updated_at'")
      }
      val updatedAt = rawObject["updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return Artifact(
        archiveDownloadUrl = archiveDownloadUrl,
        createdAt = createdAt,
        expired = expired,
        expiresAt = expiresAt,
        id = id,
        name = name,
        nodeId = nodeId,
        sizeInBytes = sizeInBytes,
        updatedAt = updatedAt,
        url = url,
        digestState = json.decodeOptional(rawObject, "digest", nullable = true),
        workflowRunState = json.decodeOptional(rawObject, "workflow_run", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Artifact) {
      val jsonEncoder = encoder.requireJsonEncoder("Artifact")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("archive_download_url", value.archiveDownloadUrl)
        put("created_at", value.createdAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("expired", json.encodeToJsonElement(value.expired))
        put("expires_at", value.expiresAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("size_in_bytes", json.encodeToJsonElement(value.sizeInBytes))
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url)
        putState("digest", value.digestState, json::encodeToJsonElement)
        putState("workflow_run", value.workflowRunState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun artifact(block: Artifact.Builder.() -> Unit): Artifact = Artifact.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Artifact is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Artifact property '" + name + "' is not nullable")
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
