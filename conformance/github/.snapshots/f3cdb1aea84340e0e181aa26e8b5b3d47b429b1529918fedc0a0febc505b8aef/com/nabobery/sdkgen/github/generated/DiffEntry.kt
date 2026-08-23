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
 * Diff Entry
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/diff-entry
 */
@Serializable(with = DiffEntry.Serializer::class)
public class DiffEntry internal constructor(
  public val additions: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val blobUrl: String,
  public val changes: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val contentsUrl: String,
  public val deletions: Int,
  public val filename: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val rawUrl: String,
  public val sha: String?,
  public val status: InlineDiffEntryStatusX02e42487,
  private val patchState: FieldState<String>,
  private val previousFilenameState: FieldState<String>,
) {
  public val patch: String?
    get() = patchState.valueOrNull()

  public val previousFilename: String?
    get() = previousFilenameState.valueOrNull()

  public constructor(
    additions: Int,
    blobUrl: String,
    changes: Int,
    contentsUrl: String,
    deletions: Int,
    filename: String,
    rawUrl: String,
    sha: String?,
    status: InlineDiffEntryStatusX02e42487,
  ) : this(additions = additions,
  blobUrl = blobUrl,
  changes = changes,
  contentsUrl = contentsUrl,
  deletions = deletions,
  filename = filename,
  rawUrl = rawUrl,
  sha = sha,
  status = status,
  patchState = FieldState.Absent,
  previousFilenameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `patch`.
   */
  public fun patchPresence(): FieldPresence = patchState.presence

  /**
   * Returns the wire presence of `previous_filename`.
   */
  public fun previousFilenamePresence(): FieldPresence = previousFilenameState.presence

  public class Builder {
    private var additionsValue: Int? = null

    public var additions: Int
      get() = requireNotNull(additionsValue) { "additions is required" }
      set(`value`) {
        additionsValue = value
      }

    private var blobUrlValue: String? = null

    public var blobUrl: String
      get() = requireNotNull(blobUrlValue) { "blobUrl is required" }
      set(`value`) {
        blobUrlValue = value
      }

    private var changesValue: Int? = null

    public var changes: Int
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
      }

    private var contentsUrlValue: String? = null

    public var contentsUrl: String
      get() = requireNotNull(contentsUrlValue) { "contentsUrl is required" }
      set(`value`) {
        contentsUrlValue = value
      }

    private var deletionsValue: Int? = null

    public var deletions: Int
      get() = requireNotNull(deletionsValue) { "deletions is required" }
      set(`value`) {
        deletionsValue = value
      }

    private var filenameValue: String? = null

    public var filename: String
      get() = requireNotNull(filenameValue) { "filename is required" }
      set(`value`) {
        filenameValue = value
      }

    private var rawUrlValue: String? = null

    public var rawUrl: String
      get() = requireNotNull(rawUrlValue) { "rawUrl is required" }
      set(`value`) {
        rawUrlValue = value
      }

    private var statusValue: InlineDiffEntryStatusX02e42487? = null

    public var status: InlineDiffEntryStatusX02e42487
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var shaState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var sha: String?
      get() = shaState.valueOrNull()
      set(`value`) {
        shaState = value.toNullableFieldState()
      }

    private var patchState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var patch: String?
      get() = patchState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "patch is not nullable; call unsetPatch() to omit it" }
        patchState = FieldState.Value(present)
      }

    private var previousFilenameState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var previousFilename: String?
      get() = previousFilenameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "previousFilename is not nullable; call unsetPreviousFilename() to omit it" }
        previousFilenameState = FieldState.Value(present)
      }

    /**
     * Omits `patch` from serialized output.
     */
    public fun unsetPatch() {
      patchState = FieldState.Absent
    }

    /**
     * Omits `previous_filename` from serialized output.
     */
    public fun unsetPreviousFilename() {
      previousFilenameState = FieldState.Absent
    }

    public fun build(): DiffEntry {
      check(additionsValue != null) { "additions is required" }
      check(blobUrlValue != null) { "blobUrl is required" }
      check(changesValue != null) { "changes is required" }
      check(contentsUrlValue != null) { "contentsUrl is required" }
      check(deletionsValue != null) { "deletions is required" }
      check(filenameValue != null) { "filename is required" }
      check(rawUrlValue != null) { "rawUrl is required" }
      check(statusValue != null) { "status is required" }
      check(shaState !== FieldState.Absent) { "sha is required, even when null" }
      return DiffEntry(
        additions = additions,
        blobUrl = blobUrl,
        changes = changes,
        contentsUrl = contentsUrl,
        deletions = deletions,
        filename = filename,
        rawUrl = rawUrl,
        sha = shaState.valueOrNull(),
        status = status,
        patchState = patchState,
        previousFilenameState = previousFilenameState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DiffEntry = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<DiffEntry> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DiffEntry {
      val jsonDecoder = decoder.requireJsonDecoder("DiffEntry")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DiffEntry must be a JSON object")
      val additions = json.decodeRequired<Int>(rawObject, "additions")
      val blobUrl = json.decodeRequired<String>(rawObject, "blob_url")
      val changes = json.decodeRequired<Int>(rawObject, "changes")
      val contentsUrl = json.decodeRequired<String>(rawObject, "contents_url")
      val deletions = json.decodeRequired<Int>(rawObject, "deletions")
      val filename = json.decodeRequired<String>(rawObject, "filename")
      val rawUrl = json.decodeRequired<String>(rawObject, "raw_url")
      val status = json.decodeRequired<InlineDiffEntryStatusX02e42487>(rawObject, "status")
      if (!rawObject.containsKey("sha")) {
        throw SerializationException("DiffEntry is missing required property 'sha'")
      }
      val sha = rawObject["sha"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return DiffEntry(
        additions = additions,
        blobUrl = blobUrl,
        changes = changes,
        contentsUrl = contentsUrl,
        deletions = deletions,
        filename = filename,
        rawUrl = rawUrl,
        sha = sha,
        status = status,
        patchState = json.decodeOptional(rawObject, "patch", nullable = false),
        previousFilenameState = json.decodeOptional(rawObject, "previous_filename", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: DiffEntry) {
      val jsonEncoder = encoder.requireJsonEncoder("DiffEntry")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("additions", json.encodeToJsonElement(value.additions))
        put("blob_url", value.blobUrl)
        put("changes", json.encodeToJsonElement(value.changes))
        put("contents_url", value.contentsUrl)
        put("deletions", json.encodeToJsonElement(value.deletions))
        put("filename", value.filename)
        put("raw_url", value.rawUrl)
        put("sha", value.sha?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("status", json.encodeToJsonElement(value.status))
        putState("patch", value.patchState, json::encodeToJsonElement)
        putState("previous_filename", value.previousFilenameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun diffEntry(block: DiffEntry.Builder.() -> Unit): DiffEntry = DiffEntry.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DiffEntry is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("DiffEntry property '" + name + "' is not nullable")
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
