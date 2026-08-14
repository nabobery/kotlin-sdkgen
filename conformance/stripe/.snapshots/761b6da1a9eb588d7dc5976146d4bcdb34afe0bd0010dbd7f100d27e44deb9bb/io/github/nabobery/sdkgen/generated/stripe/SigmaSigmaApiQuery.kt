package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A saved query object represents a query that can be executed for a run.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/sigma.sigma_api_query
 */
@Serializable(with = SigmaSigmaApiQuery.Serializer::class)
public class SigmaSigmaApiQuery(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * The name of the query.
   */
  public val name: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineSigmaSigmaApiQueryObjectValueXf64176a4,
  /**
   * The sql statement for the query.
   */
  public val sql: String,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var objectValueValue: InlineSigmaSigmaApiQueryObjectValueXf64176a4? = null

    public var objectValue: InlineSigmaSigmaApiQueryObjectValueXf64176a4
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var sqlValue: String? = null

    public var sql: String
      get() = requireNotNull(sqlValue) { "sql is required" }
      set(`value`) {
        sqlValue = value
      }

    public fun build(): SigmaSigmaApiQuery {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(sqlValue != null) { "sql is required" }
      return SigmaSigmaApiQuery(
        created = created,
        id = id,
        livemode = livemode,
        name = name,
        objectValue = objectValue,
        sql = sql,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SigmaSigmaApiQuery = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SigmaSigmaApiQuery> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SigmaSigmaApiQuery {
      val jsonDecoder = decoder.requireJsonDecoder("SigmaSigmaApiQuery")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SigmaSigmaApiQuery must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlineSigmaSigmaApiQueryObjectValueXf64176a4>(rawObject, "object")
      val sql = json.decodeRequired<String>(rawObject, "sql")
      return SigmaSigmaApiQuery(
        created = created,
        id = id,
        livemode = livemode,
        name = name,
        objectValue = objectValue,
        sql = sql,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SigmaSigmaApiQuery) {
      val jsonEncoder = encoder.requireJsonEncoder("SigmaSigmaApiQuery")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("sql", value.sql)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sigmaSigmaApiQuery(block: SigmaSigmaApiQuery.Builder.() -> Unit): SigmaSigmaApiQuery = SigmaSigmaApiQuery.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SigmaSigmaApiQuery is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
